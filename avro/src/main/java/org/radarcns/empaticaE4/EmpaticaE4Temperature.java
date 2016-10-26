/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.radarcns.empaticaE4;  
@SuppressWarnings("all")
/** Data from temperature sensor expressed degrees on the Celsius (°C) scale. */
@org.apache.avro.specific.AvroGenerated
public class EmpaticaE4Temperature extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmpaticaE4Temperature\",\"namespace\":\"org.radarcns.empaticaE4\",\"doc\":\"Data from temperature sensor expressed degrees on the Celsius (°C) scale.\",\"fields\":[{\"name\":\"time\",\"type\":\"double\",\"doc\":\"device timestamp in UTC (s)\"},{\"name\":\"timeReceived\",\"type\":\"double\",\"doc\":\"device receiver timestamp in UTC (s)\"},{\"name\":\"temperature\",\"type\":\"float\",\"doc\":\"temperature (°C)\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** device timestamp in UTC (s) */
  @Deprecated public double time;
  /** device receiver timestamp in UTC (s) */
  @Deprecated public double timeReceived;
  /** temperature (°C) */
  @Deprecated public float temperature;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EmpaticaE4Temperature() {}

  /**
   * All-args constructor.
   */
  public EmpaticaE4Temperature(java.lang.Double time, java.lang.Double timeReceived, java.lang.Float temperature) {
    this.time = time;
    this.timeReceived = timeReceived;
    this.temperature = temperature;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return time;
    case 1: return timeReceived;
    case 2: return temperature;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: time = (java.lang.Double)value$; break;
    case 1: timeReceived = (java.lang.Double)value$; break;
    case 2: temperature = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'time' field.
   * device timestamp in UTC (s)   */
  public java.lang.Double getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * device timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTime(java.lang.Double value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   */
  public java.lang.Double getTimeReceived() {
    return timeReceived;
  }

  /**
   * Sets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.Double value) {
    this.timeReceived = value;
  }

  /**
   * Gets the value of the 'temperature' field.
   * temperature (°C)   */
  public java.lang.Float getTemperature() {
    return temperature;
  }

  /**
   * Sets the value of the 'temperature' field.
   * temperature (°C)   * @param value the value to set.
   */
  public void setTemperature(java.lang.Float value) {
    this.temperature = value;
  }

  /** Creates a new EmpaticaE4Temperature RecordBuilder */
  public static org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder newBuilder() {
    return new org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder();
  }
  
  /** Creates a new EmpaticaE4Temperature RecordBuilder by copying an existing Builder */
  public static org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder newBuilder(org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder other) {
    return new org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder(other);
  }
  
  /** Creates a new EmpaticaE4Temperature RecordBuilder by copying an existing EmpaticaE4Temperature instance */
  public static org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder newBuilder(org.radarcns.empaticaE4.EmpaticaE4Temperature other) {
    return new org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder(other);
  }
  
  /**
   * RecordBuilder for EmpaticaE4Temperature instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmpaticaE4Temperature>
    implements org.apache.avro.data.RecordBuilder<EmpaticaE4Temperature> {

    private double time;
    private double timeReceived;
    private float temperature;

    /** Creates a new Builder */
    private Builder() {
      super(org.radarcns.empaticaE4.EmpaticaE4Temperature.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.temperature)) {
        this.temperature = data().deepCopy(fields()[2].schema(), other.temperature);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EmpaticaE4Temperature instance */
    private Builder(org.radarcns.empaticaE4.EmpaticaE4Temperature other) {
            super(org.radarcns.empaticaE4.EmpaticaE4Temperature.SCHEMA$);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.temperature)) {
        this.temperature = data().deepCopy(fields()[2].schema(), other.temperature);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'time' field */
    public java.lang.Double getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder setTime(double value) {
      validate(fields()[0], value);
      this.time = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'time' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeReceived' field */
    public java.lang.Double getTimeReceived() {
      return timeReceived;
    }
    
    /** Sets the value of the 'timeReceived' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder setTimeReceived(double value) {
      validate(fields()[1], value);
      this.timeReceived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeReceived' field has been set */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeReceived' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder clearTimeReceived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'temperature' field */
    public java.lang.Float getTemperature() {
      return temperature;
    }
    
    /** Sets the value of the 'temperature' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder setTemperature(float value) {
      validate(fields()[2], value);
      this.temperature = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'temperature' field has been set */
    public boolean hasTemperature() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'temperature' field */
    public org.radarcns.empaticaE4.EmpaticaE4Temperature.Builder clearTemperature() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public EmpaticaE4Temperature build() {
      try {
        EmpaticaE4Temperature record = new EmpaticaE4Temperature();
        record.time = fieldSetFlags()[0] ? this.time : (java.lang.Double) defaultValue(fields()[0]);
        record.timeReceived = fieldSetFlags()[1] ? this.timeReceived : (java.lang.Double) defaultValue(fields()[1]);
        record.temperature = fieldSetFlags()[2] ? this.temperature : (java.lang.Float) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
