// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector.proto

package com.lightstep.tracer.grpc;

/**
 * Protobuf type {@code lightstep.collector.SpanContext}
 */
public  final class SpanContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lightstep.collector.SpanContext)
    SpanContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpanContext.newBuilder() to construct.
  private SpanContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpanContext() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpanContext(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            traceId_ = input.readUInt64();
            break;
          }
          case 16: {

            spanId_ = input.readUInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              baggage_ = com.google.protobuf.MapField.newMapField(
                  BaggageDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            baggage__ = input.readMessage(
                BaggageDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            baggage_.getMutableMap().put(
                baggage__.getKey(), baggage__.getValue());
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
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetBaggage();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lightstep.tracer.grpc.SpanContext.class, com.lightstep.tracer.grpc.SpanContext.Builder.class);
  }

  private int bitField0_;
  public static final int TRACE_ID_FIELD_NUMBER = 1;
  private long traceId_;
  /**
   * <code>uint64 trace_id = 1 [jstype = JS_STRING];</code>
   */
  public long getTraceId() {
    return traceId_;
  }

  public static final int SPAN_ID_FIELD_NUMBER = 2;
  private long spanId_;
  /**
   * <code>uint64 span_id = 2 [jstype = JS_STRING];</code>
   */
  public long getSpanId() {
    return spanId_;
  }

  public static final int BAGGAGE_FIELD_NUMBER = 3;
  private static final class BaggageDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_BaggageEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> baggage_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetBaggage() {
    if (baggage_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BaggageDefaultEntryHolder.defaultEntry);
    }
    return baggage_;
  }

  public int getBaggageCount() {
    return internalGetBaggage().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public boolean containsBaggage(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetBaggage().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBaggageMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getBaggage() {
    return getBaggageMap();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getBaggageMap() {
    return internalGetBaggage().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public java.lang.String getBaggageOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBaggage().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; baggage = 3;</code>
   */

  public java.lang.String getBaggageOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBaggage().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (traceId_ != 0L) {
      output.writeUInt64(1, traceId_);
    }
    if (spanId_ != 0L) {
      output.writeUInt64(2, spanId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBaggage(),
        BaggageDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (traceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, traceId_);
    }
    if (spanId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, spanId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetBaggage().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      baggage__ = BaggageDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, baggage__);
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
    if (!(obj instanceof com.lightstep.tracer.grpc.SpanContext)) {
      return super.equals(obj);
    }
    com.lightstep.tracer.grpc.SpanContext other = (com.lightstep.tracer.grpc.SpanContext) obj;

    if (getTraceId()
        != other.getTraceId()) return false;
    if (getSpanId()
        != other.getSpanId()) return false;
    if (!internalGetBaggage().equals(
        other.internalGetBaggage())) return false;
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
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTraceId());
    hash = (37 * hash) + SPAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSpanId());
    if (!internalGetBaggage().getMap().isEmpty()) {
      hash = (37 * hash) + BAGGAGE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBaggage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.SpanContext parseFrom(
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
  public static Builder newBuilder(com.lightstep.tracer.grpc.SpanContext prototype) {
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
   * Protobuf type {@code lightstep.collector.SpanContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lightstep.collector.SpanContext)
      com.lightstep.tracer.grpc.SpanContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetBaggage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableBaggage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lightstep.tracer.grpc.SpanContext.class, com.lightstep.tracer.grpc.SpanContext.Builder.class);
    }

    // Construct using com.lightstep.tracer.grpc.SpanContext.newBuilder()
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
      traceId_ = 0L;

      spanId_ = 0L;

      internalGetMutableBaggage().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_SpanContext_descriptor;
    }

    @java.lang.Override
    public com.lightstep.tracer.grpc.SpanContext getDefaultInstanceForType() {
      return com.lightstep.tracer.grpc.SpanContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.lightstep.tracer.grpc.SpanContext build() {
      com.lightstep.tracer.grpc.SpanContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lightstep.tracer.grpc.SpanContext buildPartial() {
      com.lightstep.tracer.grpc.SpanContext result = new com.lightstep.tracer.grpc.SpanContext(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.traceId_ = traceId_;
      result.spanId_ = spanId_;
      result.baggage_ = internalGetBaggage();
      result.baggage_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.lightstep.tracer.grpc.SpanContext) {
        return mergeFrom((com.lightstep.tracer.grpc.SpanContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lightstep.tracer.grpc.SpanContext other) {
      if (other == com.lightstep.tracer.grpc.SpanContext.getDefaultInstance()) return this;
      if (other.getTraceId() != 0L) {
        setTraceId(other.getTraceId());
      }
      if (other.getSpanId() != 0L) {
        setSpanId(other.getSpanId());
      }
      internalGetMutableBaggage().mergeFrom(
          other.internalGetBaggage());
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
      com.lightstep.tracer.grpc.SpanContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lightstep.tracer.grpc.SpanContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long traceId_ ;
    /**
     * <code>uint64 trace_id = 1 [jstype = JS_STRING];</code>
     */
    public long getTraceId() {
      return traceId_;
    }
    /**
     * <code>uint64 trace_id = 1 [jstype = JS_STRING];</code>
     */
    public Builder setTraceId(long value) {
      
      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 trace_id = 1 [jstype = JS_STRING];</code>
     */
    public Builder clearTraceId() {
      
      traceId_ = 0L;
      onChanged();
      return this;
    }

    private long spanId_ ;
    /**
     * <code>uint64 span_id = 2 [jstype = JS_STRING];</code>
     */
    public long getSpanId() {
      return spanId_;
    }
    /**
     * <code>uint64 span_id = 2 [jstype = JS_STRING];</code>
     */
    public Builder setSpanId(long value) {
      
      spanId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 span_id = 2 [jstype = JS_STRING];</code>
     */
    public Builder clearSpanId() {
      
      spanId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> baggage_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetBaggage() {
      if (baggage_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BaggageDefaultEntryHolder.defaultEntry);
      }
      return baggage_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableBaggage() {
      onChanged();;
      if (baggage_ == null) {
        baggage_ = com.google.protobuf.MapField.newMapField(
            BaggageDefaultEntryHolder.defaultEntry);
      }
      if (!baggage_.isMutable()) {
        baggage_ = baggage_.copy();
      }
      return baggage_;
    }

    public int getBaggageCount() {
      return internalGetBaggage().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public boolean containsBaggage(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBaggage().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBaggageMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getBaggage() {
      return getBaggageMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getBaggageMap() {
      return internalGetBaggage().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public java.lang.String getBaggageOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBaggage().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public java.lang.String getBaggageOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBaggage().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBaggage() {
      internalGetMutableBaggage().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public Builder removeBaggage(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBaggage().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableBaggage() {
      return internalGetMutableBaggage().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */
    public Builder putBaggage(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBaggage().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; baggage = 3;</code>
     */

    public Builder putAllBaggage(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableBaggage().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:lightstep.collector.SpanContext)
  }

  // @@protoc_insertion_point(class_scope:lightstep.collector.SpanContext)
  private static final com.lightstep.tracer.grpc.SpanContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lightstep.tracer.grpc.SpanContext();
  }

  public static com.lightstep.tracer.grpc.SpanContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanContext>
      PARSER = new com.google.protobuf.AbstractParser<SpanContext>() {
    @java.lang.Override
    public SpanContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpanContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpanContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpanContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lightstep.tracer.grpc.SpanContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

