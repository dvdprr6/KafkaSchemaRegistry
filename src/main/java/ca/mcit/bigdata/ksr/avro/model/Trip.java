/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ca.mcit.bigdata.ksr.avro.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Trip extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3676680495971611299L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Trip\",\"namespace\":\"ca.mcit.bigdata.ksr.avro.model\",\"fields\":[{\"name\":\"route_id\",\"type\":\"int\"},{\"name\":\"service_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"trip_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"trip_headsign\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"direction_id\",\"type\":\"int\"},{\"name\":\"shape_id\",\"type\":\"long\"},{\"name\":\"wheelchair_accessible\",\"type\":\"int\"},{\"name\":\"note_fr\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"note_en\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Trip> ENCODER =
      new BinaryMessageEncoder<Trip>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Trip> DECODER =
      new BinaryMessageDecoder<Trip>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Trip> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Trip> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Trip>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Trip to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Trip from a ByteBuffer. */
  public static Trip fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int route_id;
  @Deprecated public java.lang.String service_id;
  @Deprecated public java.lang.String trip_id;
  @Deprecated public java.lang.String trip_headsign;
  @Deprecated public int direction_id;
  @Deprecated public long shape_id;
  @Deprecated public int wheelchair_accessible;
  @Deprecated public java.lang.String note_fr;
  @Deprecated public java.lang.String note_en;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Trip() {}

  /**
   * All-args constructor.
   * @param route_id The new value for route_id
   * @param service_id The new value for service_id
   * @param trip_id The new value for trip_id
   * @param trip_headsign The new value for trip_headsign
   * @param direction_id The new value for direction_id
   * @param shape_id The new value for shape_id
   * @param wheelchair_accessible The new value for wheelchair_accessible
   * @param note_fr The new value for note_fr
   * @param note_en The new value for note_en
   */
  public Trip(java.lang.Integer route_id, java.lang.String service_id, java.lang.String trip_id, java.lang.String trip_headsign, java.lang.Integer direction_id, java.lang.Long shape_id, java.lang.Integer wheelchair_accessible, java.lang.String note_fr, java.lang.String note_en) {
    this.route_id = route_id;
    this.service_id = service_id;
    this.trip_id = trip_id;
    this.trip_headsign = trip_headsign;
    this.direction_id = direction_id;
    this.shape_id = shape_id;
    this.wheelchair_accessible = wheelchair_accessible;
    this.note_fr = note_fr;
    this.note_en = note_en;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return route_id;
    case 1: return service_id;
    case 2: return trip_id;
    case 3: return trip_headsign;
    case 4: return direction_id;
    case 5: return shape_id;
    case 6: return wheelchair_accessible;
    case 7: return note_fr;
    case 8: return note_en;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: route_id = (java.lang.Integer)value$; break;
    case 1: service_id = (java.lang.String)value$; break;
    case 2: trip_id = (java.lang.String)value$; break;
    case 3: trip_headsign = (java.lang.String)value$; break;
    case 4: direction_id = (java.lang.Integer)value$; break;
    case 5: shape_id = (java.lang.Long)value$; break;
    case 6: wheelchair_accessible = (java.lang.Integer)value$; break;
    case 7: note_fr = (java.lang.String)value$; break;
    case 8: note_en = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'route_id' field.
   * @return The value of the 'route_id' field.
   */
  public java.lang.Integer getRouteId() {
    return route_id;
  }

  /**
   * Sets the value of the 'route_id' field.
   * @param value the value to set.
   */
  public void setRouteId(java.lang.Integer value) {
    this.route_id = value;
  }

  /**
   * Gets the value of the 'service_id' field.
   * @return The value of the 'service_id' field.
   */
  public java.lang.String getServiceId() {
    return service_id;
  }

  /**
   * Sets the value of the 'service_id' field.
   * @param value the value to set.
   */
  public void setServiceId(java.lang.String value) {
    this.service_id = value;
  }

  /**
   * Gets the value of the 'trip_id' field.
   * @return The value of the 'trip_id' field.
   */
  public java.lang.String getTripId() {
    return trip_id;
  }

  /**
   * Sets the value of the 'trip_id' field.
   * @param value the value to set.
   */
  public void setTripId(java.lang.String value) {
    this.trip_id = value;
  }

  /**
   * Gets the value of the 'trip_headsign' field.
   * @return The value of the 'trip_headsign' field.
   */
  public java.lang.String getTripHeadsign() {
    return trip_headsign;
  }

  /**
   * Sets the value of the 'trip_headsign' field.
   * @param value the value to set.
   */
  public void setTripHeadsign(java.lang.String value) {
    this.trip_headsign = value;
  }

  /**
   * Gets the value of the 'direction_id' field.
   * @return The value of the 'direction_id' field.
   */
  public java.lang.Integer getDirectionId() {
    return direction_id;
  }

  /**
   * Sets the value of the 'direction_id' field.
   * @param value the value to set.
   */
  public void setDirectionId(java.lang.Integer value) {
    this.direction_id = value;
  }

  /**
   * Gets the value of the 'shape_id' field.
   * @return The value of the 'shape_id' field.
   */
  public java.lang.Long getShapeId() {
    return shape_id;
  }

  /**
   * Sets the value of the 'shape_id' field.
   * @param value the value to set.
   */
  public void setShapeId(java.lang.Long value) {
    this.shape_id = value;
  }

  /**
   * Gets the value of the 'wheelchair_accessible' field.
   * @return The value of the 'wheelchair_accessible' field.
   */
  public java.lang.Integer getWheelchairAccessible() {
    return wheelchair_accessible;
  }

  /**
   * Sets the value of the 'wheelchair_accessible' field.
   * @param value the value to set.
   */
  public void setWheelchairAccessible(java.lang.Integer value) {
    this.wheelchair_accessible = value;
  }

  /**
   * Gets the value of the 'note_fr' field.
   * @return The value of the 'note_fr' field.
   */
  public java.lang.String getNoteFr() {
    return note_fr;
  }

  /**
   * Sets the value of the 'note_fr' field.
   * @param value the value to set.
   */
  public void setNoteFr(java.lang.String value) {
    this.note_fr = value;
  }

  /**
   * Gets the value of the 'note_en' field.
   * @return The value of the 'note_en' field.
   */
  public java.lang.String getNoteEn() {
    return note_en;
  }

  /**
   * Sets the value of the 'note_en' field.
   * @param value the value to set.
   */
  public void setNoteEn(java.lang.String value) {
    this.note_en = value;
  }

  /**
   * Creates a new Trip RecordBuilder.
   * @return A new Trip RecordBuilder
   */
  public static ca.mcit.bigdata.ksr.avro.model.Trip.Builder newBuilder() {
    return new ca.mcit.bigdata.ksr.avro.model.Trip.Builder();
  }

  /**
   * Creates a new Trip RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Trip RecordBuilder
   */
  public static ca.mcit.bigdata.ksr.avro.model.Trip.Builder newBuilder(ca.mcit.bigdata.ksr.avro.model.Trip.Builder other) {
    return new ca.mcit.bigdata.ksr.avro.model.Trip.Builder(other);
  }

  /**
   * Creates a new Trip RecordBuilder by copying an existing Trip instance.
   * @param other The existing instance to copy.
   * @return A new Trip RecordBuilder
   */
  public static ca.mcit.bigdata.ksr.avro.model.Trip.Builder newBuilder(ca.mcit.bigdata.ksr.avro.model.Trip other) {
    return new ca.mcit.bigdata.ksr.avro.model.Trip.Builder(other);
  }

  /**
   * RecordBuilder for Trip instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Trip>
    implements org.apache.avro.data.RecordBuilder<Trip> {

    private int route_id;
    private java.lang.String service_id;
    private java.lang.String trip_id;
    private java.lang.String trip_headsign;
    private int direction_id;
    private long shape_id;
    private int wheelchair_accessible;
    private java.lang.String note_fr;
    private java.lang.String note_en;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ca.mcit.bigdata.ksr.avro.model.Trip.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.route_id)) {
        this.route_id = data().deepCopy(fields()[0].schema(), other.route_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.service_id)) {
        this.service_id = data().deepCopy(fields()[1].schema(), other.service_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.trip_id)) {
        this.trip_id = data().deepCopy(fields()[2].schema(), other.trip_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.trip_headsign)) {
        this.trip_headsign = data().deepCopy(fields()[3].schema(), other.trip_headsign);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.direction_id)) {
        this.direction_id = data().deepCopy(fields()[4].schema(), other.direction_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shape_id)) {
        this.shape_id = data().deepCopy(fields()[5].schema(), other.shape_id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.wheelchair_accessible)) {
        this.wheelchair_accessible = data().deepCopy(fields()[6].schema(), other.wheelchair_accessible);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.note_fr)) {
        this.note_fr = data().deepCopy(fields()[7].schema(), other.note_fr);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.note_en)) {
        this.note_en = data().deepCopy(fields()[8].schema(), other.note_en);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Trip instance
     * @param other The existing instance to copy.
     */
    private Builder(ca.mcit.bigdata.ksr.avro.model.Trip other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.route_id)) {
        this.route_id = data().deepCopy(fields()[0].schema(), other.route_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.service_id)) {
        this.service_id = data().deepCopy(fields()[1].schema(), other.service_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.trip_id)) {
        this.trip_id = data().deepCopy(fields()[2].schema(), other.trip_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.trip_headsign)) {
        this.trip_headsign = data().deepCopy(fields()[3].schema(), other.trip_headsign);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.direction_id)) {
        this.direction_id = data().deepCopy(fields()[4].schema(), other.direction_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shape_id)) {
        this.shape_id = data().deepCopy(fields()[5].schema(), other.shape_id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.wheelchair_accessible)) {
        this.wheelchair_accessible = data().deepCopy(fields()[6].schema(), other.wheelchair_accessible);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.note_fr)) {
        this.note_fr = data().deepCopy(fields()[7].schema(), other.note_fr);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.note_en)) {
        this.note_en = data().deepCopy(fields()[8].schema(), other.note_en);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'route_id' field.
      * @return The value.
      */
    public java.lang.Integer getRouteId() {
      return route_id;
    }

    /**
      * Sets the value of the 'route_id' field.
      * @param value The value of 'route_id'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setRouteId(int value) {
      validate(fields()[0], value);
      this.route_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'route_id' field has been set.
      * @return True if the 'route_id' field has been set, false otherwise.
      */
    public boolean hasRouteId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'route_id' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearRouteId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'service_id' field.
      * @return The value.
      */
    public java.lang.String getServiceId() {
      return service_id;
    }

    /**
      * Sets the value of the 'service_id' field.
      * @param value The value of 'service_id'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setServiceId(java.lang.String value) {
      validate(fields()[1], value);
      this.service_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'service_id' field has been set.
      * @return True if the 'service_id' field has been set, false otherwise.
      */
    public boolean hasServiceId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'service_id' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearServiceId() {
      service_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'trip_id' field.
      * @return The value.
      */
    public java.lang.String getTripId() {
      return trip_id;
    }

    /**
      * Sets the value of the 'trip_id' field.
      * @param value The value of 'trip_id'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setTripId(java.lang.String value) {
      validate(fields()[2], value);
      this.trip_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'trip_id' field has been set.
      * @return True if the 'trip_id' field has been set, false otherwise.
      */
    public boolean hasTripId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'trip_id' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearTripId() {
      trip_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'trip_headsign' field.
      * @return The value.
      */
    public java.lang.String getTripHeadsign() {
      return trip_headsign;
    }

    /**
      * Sets the value of the 'trip_headsign' field.
      * @param value The value of 'trip_headsign'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setTripHeadsign(java.lang.String value) {
      validate(fields()[3], value);
      this.trip_headsign = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'trip_headsign' field has been set.
      * @return True if the 'trip_headsign' field has been set, false otherwise.
      */
    public boolean hasTripHeadsign() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'trip_headsign' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearTripHeadsign() {
      trip_headsign = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'direction_id' field.
      * @return The value.
      */
    public java.lang.Integer getDirectionId() {
      return direction_id;
    }

    /**
      * Sets the value of the 'direction_id' field.
      * @param value The value of 'direction_id'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setDirectionId(int value) {
      validate(fields()[4], value);
      this.direction_id = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'direction_id' field has been set.
      * @return True if the 'direction_id' field has been set, false otherwise.
      */
    public boolean hasDirectionId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'direction_id' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearDirectionId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'shape_id' field.
      * @return The value.
      */
    public java.lang.Long getShapeId() {
      return shape_id;
    }

    /**
      * Sets the value of the 'shape_id' field.
      * @param value The value of 'shape_id'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setShapeId(long value) {
      validate(fields()[5], value);
      this.shape_id = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'shape_id' field has been set.
      * @return True if the 'shape_id' field has been set, false otherwise.
      */
    public boolean hasShapeId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'shape_id' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearShapeId() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'wheelchair_accessible' field.
      * @return The value.
      */
    public java.lang.Integer getWheelchairAccessible() {
      return wheelchair_accessible;
    }

    /**
      * Sets the value of the 'wheelchair_accessible' field.
      * @param value The value of 'wheelchair_accessible'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setWheelchairAccessible(int value) {
      validate(fields()[6], value);
      this.wheelchair_accessible = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'wheelchair_accessible' field has been set.
      * @return True if the 'wheelchair_accessible' field has been set, false otherwise.
      */
    public boolean hasWheelchairAccessible() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'wheelchair_accessible' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearWheelchairAccessible() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'note_fr' field.
      * @return The value.
      */
    public java.lang.String getNoteFr() {
      return note_fr;
    }

    /**
      * Sets the value of the 'note_fr' field.
      * @param value The value of 'note_fr'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setNoteFr(java.lang.String value) {
      validate(fields()[7], value);
      this.note_fr = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'note_fr' field has been set.
      * @return True if the 'note_fr' field has been set, false otherwise.
      */
    public boolean hasNoteFr() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'note_fr' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearNoteFr() {
      note_fr = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'note_en' field.
      * @return The value.
      */
    public java.lang.String getNoteEn() {
      return note_en;
    }

    /**
      * Sets the value of the 'note_en' field.
      * @param value The value of 'note_en'.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder setNoteEn(java.lang.String value) {
      validate(fields()[8], value);
      this.note_en = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'note_en' field has been set.
      * @return True if the 'note_en' field has been set, false otherwise.
      */
    public boolean hasNoteEn() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'note_en' field.
      * @return This builder.
      */
    public ca.mcit.bigdata.ksr.avro.model.Trip.Builder clearNoteEn() {
      note_en = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Trip build() {
      try {
        Trip record = new Trip();
        record.route_id = fieldSetFlags()[0] ? this.route_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.service_id = fieldSetFlags()[1] ? this.service_id : (java.lang.String) defaultValue(fields()[1]);
        record.trip_id = fieldSetFlags()[2] ? this.trip_id : (java.lang.String) defaultValue(fields()[2]);
        record.trip_headsign = fieldSetFlags()[3] ? this.trip_headsign : (java.lang.String) defaultValue(fields()[3]);
        record.direction_id = fieldSetFlags()[4] ? this.direction_id : (java.lang.Integer) defaultValue(fields()[4]);
        record.shape_id = fieldSetFlags()[5] ? this.shape_id : (java.lang.Long) defaultValue(fields()[5]);
        record.wheelchair_accessible = fieldSetFlags()[6] ? this.wheelchair_accessible : (java.lang.Integer) defaultValue(fields()[6]);
        record.note_fr = fieldSetFlags()[7] ? this.note_fr : (java.lang.String) defaultValue(fields()[7]);
        record.note_en = fieldSetFlags()[8] ? this.note_en : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Trip>
    WRITER$ = (org.apache.avro.io.DatumWriter<Trip>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Trip>
    READER$ = (org.apache.avro.io.DatumReader<Trip>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
