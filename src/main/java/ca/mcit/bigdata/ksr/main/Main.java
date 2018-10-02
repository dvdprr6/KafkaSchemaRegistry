package ca.mcit.bigdata.ksr.main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import ca.mcit.bigdata.ksr.avro.model.StopTime;
import ca.mcit.bigdata.ksr.avro.model.Trip;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class Main {

    private static final String TOPIC = "stop_time";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String SCHEMA_REGISTRY_URL = "http://localhost:8081";
    /** Path to the file that contains stop time*/
    private static final String STOP_TIME_PATH = "/home/vagrant/gtfs_stm/stop_times.txt";

    public static void main(String[] args) throws Exception{
        int identityMapCapacity = 1;
        // 1. connect to Schema registry
        SchemaRegistryClient srClient = new CachedSchemaRegistryClient(SCHEMA_REGISTRY_URL, identityMapCapacity);
        // 2. register schema
        srClient.register("trip-value", Trip.SCHEMA$);
        // 2.a register Stop Times subject
        // Add the code to create a new subject in schema registry fo stop times
        srClient.register("stop-time-value", StopTime.SCHEMA$);
        // 3. read data
        List<StopTime> stopTimes = readStopTimes(STOP_TIME_PATH);
        // 4. produce records to Kafka
        // 4.a create a producer object
        Producer<String, GenericRecord> producer = createProducer();
        for (StopTime stopTime : stopTimes) {
            // 4.b what is the partition key?
            String partitionKey = stopTime.getTripId();
            producer.send(new ProducerRecord<>(TOPIC, partitionKey, stopTime));
        }

    }

    private static List<StopTime> readStopTimes(String fileName) throws URISyntaxException, IOException {
        /*
    	List<String> inRecords =
                Files.readAllLines(
                        Paths.get(Objects.requireNonNull(Thread
                                .currentThread()
                                .getContextClassLoader()
                                .getResource(fileName)).toURI()), Charset.defaultCharset());
        */
    	List<String> inRecords = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        inRecords.remove(0);
        
        return inRecords.stream()
                .map(Main::stringToStopTime).collect(Collectors.toList());

    }

    /**
     * Implement this method to convert a record in CSV string to an object of {@link StopTime}
     *
     * @param record input record
     * @return converted object
     */
    private static StopTime stringToStopTime(String record) {
        String[] line = record.split(",");
        
        String trip_id = line[0];
        String arrival_time = line[1];
        String departure_time = line[2];
        Long stop_id = Long.valueOf(line[3]);
        Integer stop_sequence = Integer.valueOf(line[4]);
    	
    	return new StopTime(trip_id, arrival_time, departure_time, stop_id, stop_sequence);
    }

    private static Producer<String, GenericRecord> createProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "mcit-bigdata-course5-assignment");
        props.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        return new KafkaProducer<>(props);
    }
}
