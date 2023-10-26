// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomerService.proto

package customer;

public final class CustomerServiceOuterClass {
  private CustomerServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CreateCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CreateCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_UpdateEmailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_UpdateEmailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_UpdatePasswordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_UpdatePasswordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_CreateCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_CreateCustomerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_UpdateEmailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_UpdateEmailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_customer_UpdatePasswordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_customer_UpdatePasswordResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CustomerService.proto\022\010customer\"u\n\025Cre" +
      "ateCustomerRequest\022\022\n\nfirst_name\030\001 \001(\t\022\021" +
      "\n\tlast_name\030\002 \001(\t\022\024\n\014phone_number\030\003 \001(\t\022" +
      "\r\n\005email\030\004 \001(\t\022\020\n\010password\030\005 \001(\t\"6\n\022Upda" +
      "teEmailRequest\022\021\n\taccountId\030\001 \001(\005\022\r\n\005ema" +
      "il\030\002 \001(\t\"<\n\025UpdatePasswordRequest\022\021\n\tacc" +
      "ountId\030\001 \001(\005\022\020\n\010password\030\002 \001(\t\"\030\n\026Create" +
      "CustomerResponse\"\025\n\023UpdateEmailResponse\"" +
      "\030\n\026UpdatePasswordResponse2\207\002\n\017CustomerSe" +
      "rvice\022S\n\016CreateCustomer\022\037.customer.Creat",
      "eCustomerRequest\032 .customer.CreateCustom" +
      "erResponse\022J\n\013UpdateEmail\022\034.customer.Upd" +
      "ateEmailRequest\032\035.customer.UpdateEmailRe" +
      "sponse\022S\n\016UpdatePassword\022\037.customer.Upda" +
      "tePasswordRequest\032 .customer.UpdatePassw" +
      "ordResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_customer_CreateCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_customer_CreateCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CreateCustomerRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "PhoneNumber", "Email", "Password", });
    internal_static_customer_UpdateEmailRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_customer_UpdateEmailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_UpdateEmailRequest_descriptor,
        new java.lang.String[] { "AccountId", "Email", });
    internal_static_customer_UpdatePasswordRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_customer_UpdatePasswordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_UpdatePasswordRequest_descriptor,
        new java.lang.String[] { "AccountId", "Password", });
    internal_static_customer_CreateCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_customer_CreateCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_CreateCustomerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_customer_UpdateEmailResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_customer_UpdateEmailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_UpdateEmailResponse_descriptor,
        new java.lang.String[] { });
    internal_static_customer_UpdatePasswordResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_customer_UpdatePasswordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_customer_UpdatePasswordResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
