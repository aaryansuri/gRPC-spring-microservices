// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package com.grpc.models;

/**
 * Protobuf type {@code common.Car}
 */
public final class Car extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Car)
    CarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Car.newBuilder() to construct.
  private Car(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Car() {
    company_ = "";
    model_ = "";
    style_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Car();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Car(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            company_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
            break;
          }
          case 24: {

            year_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            style_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.models.CarOuterClass.internal_static_common_Car_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.models.CarOuterClass.internal_static_common_Car_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.models.Car.class, com.grpc.models.Car.Builder.class);
  }

  public static final int COMPANY_FIELD_NUMBER = 1;
  private volatile java.lang.Object company_;
  /**
   * <code>string company = 1;</code>
   * @return The company.
   */
  @java.lang.Override
  public java.lang.String getCompany() {
    java.lang.Object ref = company_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      company_ = s;
      return s;
    }
  }
  /**
   * <code>string company = 1;</code>
   * @return The bytes for company.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompanyBytes() {
    java.lang.Object ref = company_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      company_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object model_;
  /**
   * <code>string model = 2;</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <code>string model = 2;</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YEAR_FIELD_NUMBER = 3;
  private int year_;
  /**
   * <code>int32 year = 3;</code>
   * @return The year.
   */
  @java.lang.Override
  public int getYear() {
    return year_;
  }

  public static final int STYLE_FIELD_NUMBER = 4;
  private int style_;
  /**
   * <code>.common.BodyStyle style = 4;</code>
   * @return The enum numeric value on the wire for style.
   */
  @java.lang.Override public int getStyleValue() {
    return style_;
  }
  /**
   * <code>.common.BodyStyle style = 4;</code>
   * @return The style.
   */
  @java.lang.Override public com.grpc.models.BodyStyle getStyle() {
    @SuppressWarnings("deprecation")
    com.grpc.models.BodyStyle result = com.grpc.models.BodyStyle.valueOf(style_);
    return result == null ? com.grpc.models.BodyStyle.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(company_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, company_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    if (year_ != 0) {
      output.writeInt32(3, year_);
    }
    if (style_ != com.grpc.models.BodyStyle.UNKNOWN.getNumber()) {
      output.writeEnum(4, style_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(company_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, company_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
    }
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, year_);
    }
    if (style_ != com.grpc.models.BodyStyle.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, style_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.models.Car)) {
      return super.equals(obj);
    }
    com.grpc.models.Car other = (com.grpc.models.Car) obj;

    if (!getCompany()
        .equals(other.getCompany())) return false;
    if (!getModel()
        .equals(other.getModel())) return false;
    if (getYear()
        != other.getYear()) return false;
    if (style_ != other.style_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMPANY_FIELD_NUMBER;
    hash = (53 * hash) + getCompany().hashCode();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + STYLE_FIELD_NUMBER;
    hash = (53 * hash) + style_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.models.Car parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.Car parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.models.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.models.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.models.Car prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code common.Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Car)
      com.grpc.models.CarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.models.CarOuterClass.internal_static_common_Car_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.models.CarOuterClass.internal_static_common_Car_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.models.Car.class, com.grpc.models.Car.Builder.class);
    }

    // Construct using com.grpc.models.Car.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      company_ = "";

      model_ = "";

      year_ = 0;

      style_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.models.CarOuterClass.internal_static_common_Car_descriptor;
    }

    @java.lang.Override
    public com.grpc.models.Car getDefaultInstanceForType() {
      return com.grpc.models.Car.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.models.Car build() {
      com.grpc.models.Car result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.models.Car buildPartial() {
      com.grpc.models.Car result = new com.grpc.models.Car(this);
      result.company_ = company_;
      result.model_ = model_;
      result.year_ = year_;
      result.style_ = style_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.models.Car) {
        return mergeFrom((com.grpc.models.Car)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.models.Car other) {
      if (other == com.grpc.models.Car.getDefaultInstance()) return this;
      if (!other.getCompany().isEmpty()) {
        company_ = other.company_;
        onChanged();
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (other.style_ != 0) {
        setStyleValue(other.getStyleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.models.Car parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.models.Car) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object company_ = "";
    /**
     * <code>string company = 1;</code>
     * @return The company.
     */
    public java.lang.String getCompany() {
      java.lang.Object ref = company_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        company_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string company = 1;</code>
     * @return The bytes for company.
     */
    public com.google.protobuf.ByteString
        getCompanyBytes() {
      java.lang.Object ref = company_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        company_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string company = 1;</code>
     * @param value The company to set.
     * @return This builder for chaining.
     */
    public Builder setCompany(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      company_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string company = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompany() {
      
      company_ = getDefaultInstance().getCompany();
      onChanged();
      return this;
    }
    /**
     * <code>string company = 1;</code>
     * @param value The bytes for company to set.
     * @return This builder for chaining.
     */
    public Builder setCompanyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      company_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>string model = 2;</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model = 2;</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model = 2;</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <code>string model = 2;</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private int year_ ;
    /**
     * <code>int32 year = 3;</code>
     * @return The year.
     */
    @java.lang.Override
    public int getYear() {
      return year_;
    }
    /**
     * <code>int32 year = 3;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 year = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private int style_ = 0;
    /**
     * <code>.common.BodyStyle style = 4;</code>
     * @return The enum numeric value on the wire for style.
     */
    @java.lang.Override public int getStyleValue() {
      return style_;
    }
    /**
     * <code>.common.BodyStyle style = 4;</code>
     * @param value The enum numeric value on the wire for style to set.
     * @return This builder for chaining.
     */
    public Builder setStyleValue(int value) {
      
      style_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.common.BodyStyle style = 4;</code>
     * @return The style.
     */
    @java.lang.Override
    public com.grpc.models.BodyStyle getStyle() {
      @SuppressWarnings("deprecation")
      com.grpc.models.BodyStyle result = com.grpc.models.BodyStyle.valueOf(style_);
      return result == null ? com.grpc.models.BodyStyle.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.BodyStyle style = 4;</code>
     * @param value The style to set.
     * @return This builder for chaining.
     */
    public Builder setStyle(com.grpc.models.BodyStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      style_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.common.BodyStyle style = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStyle() {
      
      style_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:common.Car)
  }

  // @@protoc_insertion_point(class_scope:common.Car)
  private static final com.grpc.models.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.models.Car();
  }

  public static com.grpc.models.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Car>
      PARSER = new com.google.protobuf.AbstractParser<Car>() {
    @java.lang.Override
    public Car parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Car(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Car> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Car> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.models.Car getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

