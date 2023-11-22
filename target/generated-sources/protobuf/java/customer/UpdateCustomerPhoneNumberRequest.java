// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomerService.proto

package customer;

/**
 * Protobuf type {@code customer.UpdateCustomerPhoneNumberRequest}
 */
public  final class UpdateCustomerPhoneNumberRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:customer.UpdateCustomerPhoneNumberRequest)
    UpdateCustomerPhoneNumberRequestOrBuilder {
  // Use UpdateCustomerPhoneNumberRequest.newBuilder() to construct.
  private UpdateCustomerPhoneNumberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCustomerPhoneNumberRequest() {
    accountId_ = 0;
    phoneNumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCustomerPhoneNumberRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            accountId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            phoneNumber_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return customer.CustomerServiceOuterClass.internal_static_customer_UpdateCustomerPhoneNumberRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return customer.CustomerServiceOuterClass.internal_static_customer_UpdateCustomerPhoneNumberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            customer.UpdateCustomerPhoneNumberRequest.class, customer.UpdateCustomerPhoneNumberRequest.Builder.class);
  }

  public static final int ACCOUNTID_FIELD_NUMBER = 1;
  private int accountId_;
  /**
   * <code>int32 accountId = 1;</code>
   */
  public int getAccountId() {
    return accountId_;
  }

  public static final int PHONENUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object phoneNumber_;
  /**
   * <code>string phoneNumber = 2;</code>
   */
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string phoneNumber = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneNumberBytes() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (accountId_ != 0) {
      output.writeInt32(1, accountId_);
    }
    if (!getPhoneNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, phoneNumber_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, accountId_);
    }
    if (!getPhoneNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, phoneNumber_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof customer.UpdateCustomerPhoneNumberRequest)) {
      return super.equals(obj);
    }
    customer.UpdateCustomerPhoneNumberRequest other = (customer.UpdateCustomerPhoneNumberRequest) obj;

    boolean result = true;
    result = result && (getAccountId()
        == other.getAccountId());
    result = result && getPhoneNumber()
        .equals(other.getPhoneNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCOUNTID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId();
    hash = (37 * hash) + PHONENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static customer.UpdateCustomerPhoneNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(customer.UpdateCustomerPhoneNumberRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code customer.UpdateCustomerPhoneNumberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:customer.UpdateCustomerPhoneNumberRequest)
      customer.UpdateCustomerPhoneNumberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return customer.CustomerServiceOuterClass.internal_static_customer_UpdateCustomerPhoneNumberRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return customer.CustomerServiceOuterClass.internal_static_customer_UpdateCustomerPhoneNumberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              customer.UpdateCustomerPhoneNumberRequest.class, customer.UpdateCustomerPhoneNumberRequest.Builder.class);
    }

    // Construct using customer.UpdateCustomerPhoneNumberRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      accountId_ = 0;

      phoneNumber_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return customer.CustomerServiceOuterClass.internal_static_customer_UpdateCustomerPhoneNumberRequest_descriptor;
    }

    public customer.UpdateCustomerPhoneNumberRequest getDefaultInstanceForType() {
      return customer.UpdateCustomerPhoneNumberRequest.getDefaultInstance();
    }

    public customer.UpdateCustomerPhoneNumberRequest build() {
      customer.UpdateCustomerPhoneNumberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public customer.UpdateCustomerPhoneNumberRequest buildPartial() {
      customer.UpdateCustomerPhoneNumberRequest result = new customer.UpdateCustomerPhoneNumberRequest(this);
      result.accountId_ = accountId_;
      result.phoneNumber_ = phoneNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof customer.UpdateCustomerPhoneNumberRequest) {
        return mergeFrom((customer.UpdateCustomerPhoneNumberRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(customer.UpdateCustomerPhoneNumberRequest other) {
      if (other == customer.UpdateCustomerPhoneNumberRequest.getDefaultInstance()) return this;
      if (other.getAccountId() != 0) {
        setAccountId(other.getAccountId());
      }
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      customer.UpdateCustomerPhoneNumberRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (customer.UpdateCustomerPhoneNumberRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int accountId_ ;
    /**
     * <code>int32 accountId = 1;</code>
     */
    public int getAccountId() {
      return accountId_;
    }
    /**
     * <code>int32 accountId = 1;</code>
     */
    public Builder setAccountId(int value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 accountId = 1;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object phoneNumber_ = "";
    /**
     * <code>string phoneNumber = 2;</code>
     */
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phoneNumber = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phoneNumber = 2;</code>
     */
    public Builder setPhoneNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phoneNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phoneNumber = 2;</code>
     */
    public Builder clearPhoneNumber() {
      
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string phoneNumber = 2;</code>
     */
    public Builder setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phoneNumber_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:customer.UpdateCustomerPhoneNumberRequest)
  }

  // @@protoc_insertion_point(class_scope:customer.UpdateCustomerPhoneNumberRequest)
  private static final customer.UpdateCustomerPhoneNumberRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new customer.UpdateCustomerPhoneNumberRequest();
  }

  public static customer.UpdateCustomerPhoneNumberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCustomerPhoneNumberRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCustomerPhoneNumberRequest>() {
    public UpdateCustomerPhoneNumberRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateCustomerPhoneNumberRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCustomerPhoneNumberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCustomerPhoneNumberRequest> getParserForType() {
    return PARSER;
  }

  public customer.UpdateCustomerPhoneNumberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
