/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hcl.uob.poc.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4742849423876345200L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerDetails\",\"namespace\":\"com.hcl.uob.poc.model\",\"fields\":[{\"name\":\"card\",\"type\":\"int\"},{\"name\":\"custId\",\"type\":\"string\"},{\"name\":\"transaction_amount\",\"type\":\"string\"},{\"name\":\"first_name\",\"type\":\"string\"},{\"name\":\"middle_name\",\"type\":\"string\"},{\"name\":\"last_name\",\"type\":\"string\"},{\"name\":\"dob\",\"type\":\"string\"},{\"name\":\"gender\",\"type\":\"string\"},{\"name\":\"nationality\",\"type\":\"string\"},{\"name\":\"marital_status\",\"type\":\"string\"},{\"name\":\"occupation\",\"type\":\"string\"},{\"name\":\"avg_family_size\",\"type\":\"string\"},{\"name\":\"income_level\",\"type\":\"string\"},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"emailId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CustomerDetails> ENCODER =
      new BinaryMessageEncoder<CustomerDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomerDetails> DECODER =
      new BinaryMessageDecoder<CustomerDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CustomerDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CustomerDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomerDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CustomerDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CustomerDetails from a ByteBuffer. */
  public static CustomerDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int card;
  @Deprecated public java.lang.CharSequence custId;
  @Deprecated public java.lang.CharSequence transaction_amount;
  @Deprecated public java.lang.CharSequence first_name;
  @Deprecated public java.lang.CharSequence middle_name;
  @Deprecated public java.lang.CharSequence last_name;
  @Deprecated public java.lang.CharSequence dob;
  @Deprecated public java.lang.CharSequence gender;
  @Deprecated public java.lang.CharSequence nationality;
  @Deprecated public java.lang.CharSequence marital_status;
  @Deprecated public java.lang.CharSequence occupation;
  @Deprecated public java.lang.CharSequence avg_family_size;
  @Deprecated public java.lang.CharSequence income_level;
  @Deprecated public java.lang.CharSequence location;
  @Deprecated public java.lang.CharSequence emailId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerDetails() {}

  /**
   * All-args constructor.
   * @param card The new value for card
   * @param custId The new value for custId
   * @param transaction_amount The new value for transaction_amount
   * @param first_name The new value for first_name
   * @param middle_name The new value for middle_name
   * @param last_name The new value for last_name
   * @param dob The new value for dob
   * @param gender The new value for gender
   * @param nationality The new value for nationality
   * @param marital_status The new value for marital_status
   * @param occupation The new value for occupation
   * @param avg_family_size The new value for avg_family_size
   * @param income_level The new value for income_level
   * @param location The new value for location
   * @param emailId The new value for emailId
   */
  public CustomerDetails(java.lang.Integer card, java.lang.CharSequence custId, java.lang.CharSequence transaction_amount, java.lang.CharSequence first_name, java.lang.CharSequence middle_name, java.lang.CharSequence last_name, java.lang.CharSequence dob, java.lang.CharSequence gender, java.lang.CharSequence nationality, java.lang.CharSequence marital_status, java.lang.CharSequence occupation, java.lang.CharSequence avg_family_size, java.lang.CharSequence income_level, java.lang.CharSequence location, java.lang.CharSequence emailId) {
    this.card = card;
    this.custId = custId;
    this.transaction_amount = transaction_amount;
    this.first_name = first_name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.dob = dob;
    this.gender = gender;
    this.nationality = nationality;
    this.marital_status = marital_status;
    this.occupation = occupation;
    this.avg_family_size = avg_family_size;
    this.income_level = income_level;
    this.location = location;
    this.emailId = emailId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return card;
    case 1: return custId;
    case 2: return transaction_amount;
    case 3: return first_name;
    case 4: return middle_name;
    case 5: return last_name;
    case 6: return dob;
    case 7: return gender;
    case 8: return nationality;
    case 9: return marital_status;
    case 10: return occupation;
    case 11: return avg_family_size;
    case 12: return income_level;
    case 13: return location;
    case 14: return emailId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: card = (java.lang.Integer)value$; break;
    case 1: custId = (java.lang.CharSequence)value$; break;
    case 2: transaction_amount = (java.lang.CharSequence)value$; break;
    case 3: first_name = (java.lang.CharSequence)value$; break;
    case 4: middle_name = (java.lang.CharSequence)value$; break;
    case 5: last_name = (java.lang.CharSequence)value$; break;
    case 6: dob = (java.lang.CharSequence)value$; break;
    case 7: gender = (java.lang.CharSequence)value$; break;
    case 8: nationality = (java.lang.CharSequence)value$; break;
    case 9: marital_status = (java.lang.CharSequence)value$; break;
    case 10: occupation = (java.lang.CharSequence)value$; break;
    case 11: avg_family_size = (java.lang.CharSequence)value$; break;
    case 12: income_level = (java.lang.CharSequence)value$; break;
    case 13: location = (java.lang.CharSequence)value$; break;
    case 14: emailId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'card' field.
   * @return The value of the 'card' field.
   */
  public java.lang.Integer getCard() {
    return card;
  }

  /**
   * Sets the value of the 'card' field.
   * @param value the value to set.
   */
  public void setCard(java.lang.Integer value) {
    this.card = value;
  }

  /**
   * Gets the value of the 'custId' field.
   * @return The value of the 'custId' field.
   */
  public java.lang.CharSequence getCustId() {
    return custId;
  }

  /**
   * Sets the value of the 'custId' field.
   * @param value the value to set.
   */
  public void setCustId(java.lang.CharSequence value) {
    this.custId = value;
  }

  /**
   * Gets the value of the 'transaction_amount' field.
   * @return The value of the 'transaction_amount' field.
   */
  public java.lang.CharSequence getTransactionAmount() {
    return transaction_amount;
  }

  /**
   * Sets the value of the 'transaction_amount' field.
   * @param value the value to set.
   */
  public void setTransactionAmount(java.lang.CharSequence value) {
    this.transaction_amount = value;
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return The value of the 'first_name' field.
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }

  /**
   * Sets the value of the 'first_name' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'middle_name' field.
   * @return The value of the 'middle_name' field.
   */
  public java.lang.CharSequence getMiddleName() {
    return middle_name;
  }

  /**
   * Sets the value of the 'middle_name' field.
   * @param value the value to set.
   */
  public void setMiddleName(java.lang.CharSequence value) {
    this.middle_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return The value of the 'last_name' field.
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }

  /**
   * Sets the value of the 'last_name' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'dob' field.
   * @return The value of the 'dob' field.
   */
  public java.lang.CharSequence getDob() {
    return dob;
  }

  /**
   * Sets the value of the 'dob' field.
   * @param value the value to set.
   */
  public void setDob(java.lang.CharSequence value) {
    this.dob = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public java.lang.CharSequence getGender() {
    return gender;
  }

  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.CharSequence value) {
    this.gender = value;
  }

  /**
   * Gets the value of the 'nationality' field.
   * @return The value of the 'nationality' field.
   */
  public java.lang.CharSequence getNationality() {
    return nationality;
  }

  /**
   * Sets the value of the 'nationality' field.
   * @param value the value to set.
   */
  public void setNationality(java.lang.CharSequence value) {
    this.nationality = value;
  }

  /**
   * Gets the value of the 'marital_status' field.
   * @return The value of the 'marital_status' field.
   */
  public java.lang.CharSequence getMaritalStatus() {
    return marital_status;
  }

  /**
   * Sets the value of the 'marital_status' field.
   * @param value the value to set.
   */
  public void setMaritalStatus(java.lang.CharSequence value) {
    this.marital_status = value;
  }

  /**
   * Gets the value of the 'occupation' field.
   * @return The value of the 'occupation' field.
   */
  public java.lang.CharSequence getOccupation() {
    return occupation;
  }

  /**
   * Sets the value of the 'occupation' field.
   * @param value the value to set.
   */
  public void setOccupation(java.lang.CharSequence value) {
    this.occupation = value;
  }

  /**
   * Gets the value of the 'avg_family_size' field.
   * @return The value of the 'avg_family_size' field.
   */
  public java.lang.CharSequence getAvgFamilySize() {
    return avg_family_size;
  }

  /**
   * Sets the value of the 'avg_family_size' field.
   * @param value the value to set.
   */
  public void setAvgFamilySize(java.lang.CharSequence value) {
    this.avg_family_size = value;
  }

  /**
   * Gets the value of the 'income_level' field.
   * @return The value of the 'income_level' field.
   */
  public java.lang.CharSequence getIncomeLevel() {
    return income_level;
  }

  /**
   * Sets the value of the 'income_level' field.
   * @param value the value to set.
   */
  public void setIncomeLevel(java.lang.CharSequence value) {
    this.income_level = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'emailId' field.
   * @return The value of the 'emailId' field.
   */
  public java.lang.CharSequence getEmailId() {
    return emailId;
  }

  /**
   * Sets the value of the 'emailId' field.
   * @param value the value to set.
   */
  public void setEmailId(java.lang.CharSequence value) {
    this.emailId = value;
  }

  /**
   * Creates a new CustomerDetails RecordBuilder.
   * @return A new CustomerDetails RecordBuilder
   */
  public static com.hcl.uob.poc.model.CustomerDetails.Builder newBuilder() {
    return new com.hcl.uob.poc.model.CustomerDetails.Builder();
  }

  /**
   * Creates a new CustomerDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerDetails RecordBuilder
   */
  public static com.hcl.uob.poc.model.CustomerDetails.Builder newBuilder(com.hcl.uob.poc.model.CustomerDetails.Builder other) {
    return new com.hcl.uob.poc.model.CustomerDetails.Builder(other);
  }

  /**
   * Creates a new CustomerDetails RecordBuilder by copying an existing CustomerDetails instance.
   * @param other The existing instance to copy.
   * @return A new CustomerDetails RecordBuilder
   */
  public static com.hcl.uob.poc.model.CustomerDetails.Builder newBuilder(com.hcl.uob.poc.model.CustomerDetails other) {
    return new com.hcl.uob.poc.model.CustomerDetails.Builder(other);
  }

  /**
   * RecordBuilder for CustomerDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerDetails>
    implements org.apache.avro.data.RecordBuilder<CustomerDetails> {

    private int card;
    private java.lang.CharSequence custId;
    private java.lang.CharSequence transaction_amount;
    private java.lang.CharSequence first_name;
    private java.lang.CharSequence middle_name;
    private java.lang.CharSequence last_name;
    private java.lang.CharSequence dob;
    private java.lang.CharSequence gender;
    private java.lang.CharSequence nationality;
    private java.lang.CharSequence marital_status;
    private java.lang.CharSequence occupation;
    private java.lang.CharSequence avg_family_size;
    private java.lang.CharSequence income_level;
    private java.lang.CharSequence location;
    private java.lang.CharSequence emailId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hcl.uob.poc.model.CustomerDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.card)) {
        this.card = data().deepCopy(fields()[0].schema(), other.card);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.custId)) {
        this.custId = data().deepCopy(fields()[1].schema(), other.custId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.transaction_amount)) {
        this.transaction_amount = data().deepCopy(fields()[2].schema(), other.transaction_amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.first_name)) {
        this.first_name = data().deepCopy(fields()[3].schema(), other.first_name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.middle_name)) {
        this.middle_name = data().deepCopy(fields()[4].schema(), other.middle_name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.last_name)) {
        this.last_name = data().deepCopy(fields()[5].schema(), other.last_name);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dob)) {
        this.dob = data().deepCopy(fields()[6].schema(), other.dob);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.gender)) {
        this.gender = data().deepCopy(fields()[7].schema(), other.gender);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.nationality)) {
        this.nationality = data().deepCopy(fields()[8].schema(), other.nationality);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.marital_status)) {
        this.marital_status = data().deepCopy(fields()[9].schema(), other.marital_status);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.occupation)) {
        this.occupation = data().deepCopy(fields()[10].schema(), other.occupation);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.avg_family_size)) {
        this.avg_family_size = data().deepCopy(fields()[11].schema(), other.avg_family_size);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.income_level)) {
        this.income_level = data().deepCopy(fields()[12].schema(), other.income_level);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.location)) {
        this.location = data().deepCopy(fields()[13].schema(), other.location);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.emailId)) {
        this.emailId = data().deepCopy(fields()[14].schema(), other.emailId);
        fieldSetFlags()[14] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hcl.uob.poc.model.CustomerDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.card)) {
        this.card = data().deepCopy(fields()[0].schema(), other.card);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.custId)) {
        this.custId = data().deepCopy(fields()[1].schema(), other.custId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.transaction_amount)) {
        this.transaction_amount = data().deepCopy(fields()[2].schema(), other.transaction_amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.first_name)) {
        this.first_name = data().deepCopy(fields()[3].schema(), other.first_name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.middle_name)) {
        this.middle_name = data().deepCopy(fields()[4].schema(), other.middle_name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.last_name)) {
        this.last_name = data().deepCopy(fields()[5].schema(), other.last_name);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.dob)) {
        this.dob = data().deepCopy(fields()[6].schema(), other.dob);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.gender)) {
        this.gender = data().deepCopy(fields()[7].schema(), other.gender);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.nationality)) {
        this.nationality = data().deepCopy(fields()[8].schema(), other.nationality);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.marital_status)) {
        this.marital_status = data().deepCopy(fields()[9].schema(), other.marital_status);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.occupation)) {
        this.occupation = data().deepCopy(fields()[10].schema(), other.occupation);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.avg_family_size)) {
        this.avg_family_size = data().deepCopy(fields()[11].schema(), other.avg_family_size);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.income_level)) {
        this.income_level = data().deepCopy(fields()[12].schema(), other.income_level);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.location)) {
        this.location = data().deepCopy(fields()[13].schema(), other.location);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.emailId)) {
        this.emailId = data().deepCopy(fields()[14].schema(), other.emailId);
        fieldSetFlags()[14] = true;
      }
    }

    /**
      * Gets the value of the 'card' field.
      * @return The value.
      */
    public java.lang.Integer getCard() {
      return card;
    }

    /**
      * Sets the value of the 'card' field.
      * @param value The value of 'card'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setCard(int value) {
      validate(fields()[0], value);
      this.card = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'card' field has been set.
      * @return True if the 'card' field has been set, false otherwise.
      */
    public boolean hasCard() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'card' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearCard() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'custId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustId() {
      return custId;
    }

    /**
      * Sets the value of the 'custId' field.
      * @param value The value of 'custId'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setCustId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.custId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'custId' field has been set.
      * @return True if the 'custId' field has been set, false otherwise.
      */
    public boolean hasCustId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'custId' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearCustId() {
      custId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'transaction_amount' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionAmount() {
      return transaction_amount;
    }

    /**
      * Sets the value of the 'transaction_amount' field.
      * @param value The value of 'transaction_amount'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setTransactionAmount(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.transaction_amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'transaction_amount' field has been set.
      * @return True if the 'transaction_amount' field has been set, false otherwise.
      */
    public boolean hasTransactionAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'transaction_amount' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearTransactionAmount() {
      transaction_amount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'first_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.first_name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'first_name' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'middle_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getMiddleName() {
      return middle_name;
    }

    /**
      * Sets the value of the 'middle_name' field.
      * @param value The value of 'middle_name'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setMiddleName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.middle_name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'middle_name' field has been set.
      * @return True if the 'middle_name' field has been set, false otherwise.
      */
    public boolean hasMiddleName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'middle_name' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearMiddleName() {
      middle_name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.last_name = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'last_name' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'dob' field.
      * @return The value.
      */
    public java.lang.CharSequence getDob() {
      return dob;
    }

    /**
      * Sets the value of the 'dob' field.
      * @param value The value of 'dob'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setDob(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.dob = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'dob' field has been set.
      * @return True if the 'dob' field has been set, false otherwise.
      */
    public boolean hasDob() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'dob' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearDob() {
      dob = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public java.lang.CharSequence getGender() {
      return gender;
    }

    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setGender(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.gender = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearGender() {
      gender = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'nationality' field.
      * @return The value.
      */
    public java.lang.CharSequence getNationality() {
      return nationality;
    }

    /**
      * Sets the value of the 'nationality' field.
      * @param value The value of 'nationality'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setNationality(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.nationality = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'nationality' field has been set.
      * @return True if the 'nationality' field has been set, false otherwise.
      */
    public boolean hasNationality() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'nationality' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearNationality() {
      nationality = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'marital_status' field.
      * @return The value.
      */
    public java.lang.CharSequence getMaritalStatus() {
      return marital_status;
    }

    /**
      * Sets the value of the 'marital_status' field.
      * @param value The value of 'marital_status'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setMaritalStatus(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.marital_status = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'marital_status' field has been set.
      * @return True if the 'marital_status' field has been set, false otherwise.
      */
    public boolean hasMaritalStatus() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'marital_status' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearMaritalStatus() {
      marital_status = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'occupation' field.
      * @return The value.
      */
    public java.lang.CharSequence getOccupation() {
      return occupation;
    }

    /**
      * Sets the value of the 'occupation' field.
      * @param value The value of 'occupation'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setOccupation(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.occupation = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'occupation' field has been set.
      * @return True if the 'occupation' field has been set, false otherwise.
      */
    public boolean hasOccupation() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'occupation' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearOccupation() {
      occupation = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'avg_family_size' field.
      * @return The value.
      */
    public java.lang.CharSequence getAvgFamilySize() {
      return avg_family_size;
    }

    /**
      * Sets the value of the 'avg_family_size' field.
      * @param value The value of 'avg_family_size'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setAvgFamilySize(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.avg_family_size = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'avg_family_size' field has been set.
      * @return True if the 'avg_family_size' field has been set, false otherwise.
      */
    public boolean hasAvgFamilySize() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'avg_family_size' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearAvgFamilySize() {
      avg_family_size = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'income_level' field.
      * @return The value.
      */
    public java.lang.CharSequence getIncomeLevel() {
      return income_level;
    }

    /**
      * Sets the value of the 'income_level' field.
      * @param value The value of 'income_level'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setIncomeLevel(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.income_level = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'income_level' field has been set.
      * @return True if the 'income_level' field has been set, false otherwise.
      */
    public boolean hasIncomeLevel() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'income_level' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearIncomeLevel() {
      income_level = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public java.lang.CharSequence getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.location = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearLocation() {
      location = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'emailId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmailId() {
      return emailId;
    }

    /**
      * Sets the value of the 'emailId' field.
      * @param value The value of 'emailId'.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder setEmailId(java.lang.CharSequence value) {
      validate(fields()[14], value);
      this.emailId = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
      * Checks whether the 'emailId' field has been set.
      * @return True if the 'emailId' field has been set, false otherwise.
      */
    public boolean hasEmailId() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'emailId' field.
      * @return This builder.
      */
    public com.hcl.uob.poc.model.CustomerDetails.Builder clearEmailId() {
      emailId = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomerDetails build() {
      try {
        CustomerDetails record = new CustomerDetails();
        record.card = fieldSetFlags()[0] ? this.card : (java.lang.Integer) defaultValue(fields()[0]);
        record.custId = fieldSetFlags()[1] ? this.custId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.transaction_amount = fieldSetFlags()[2] ? this.transaction_amount : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.first_name = fieldSetFlags()[3] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.middle_name = fieldSetFlags()[4] ? this.middle_name : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.last_name = fieldSetFlags()[5] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.dob = fieldSetFlags()[6] ? this.dob : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.gender = fieldSetFlags()[7] ? this.gender : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.nationality = fieldSetFlags()[8] ? this.nationality : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.marital_status = fieldSetFlags()[9] ? this.marital_status : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.occupation = fieldSetFlags()[10] ? this.occupation : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.avg_family_size = fieldSetFlags()[11] ? this.avg_family_size : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.income_level = fieldSetFlags()[12] ? this.income_level : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.location = fieldSetFlags()[13] ? this.location : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.emailId = fieldSetFlags()[14] ? this.emailId : (java.lang.CharSequence) defaultValue(fields()[14]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomerDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<CustomerDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomerDetails>
    READER$ = (org.apache.avro.io.DatumReader<CustomerDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
