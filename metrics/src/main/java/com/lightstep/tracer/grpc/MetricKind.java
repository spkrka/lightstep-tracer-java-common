// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics.proto

package com.lightstep.tracer.grpc;

/**
 * <pre>
 * MetricKind indicates the semantics of the points (i.e. how to interpret values
 * relative to each other).
 * </pre>
 *
 * Protobuf enum {@code lightstep.metrics.MetricKind}
 */
public enum MetricKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * InvalidMetricKind is the default value for the MetricKind. Some languages' proto compilers
   * (e.g. Go) return the default if no value is set. The default is marked invalid here to
   * avoid a common mistake where a field is left unset and appears to be set to the default.
   * </pre>
   *
   * <code>INVALID_METRIC_KIND = 0;</code>
   */
  INVALID_METRIC_KIND(0),
  /**
   * <pre>
   * Counter metrics measure change over an interval.
   * When aggregated, counter metrics are usually added.
   * </pre>
   *
   * <code>COUNTER = 1;</code>
   */
  COUNTER(1),
  /**
   * <pre>
   * Gauge metrics measure the value at a point in time.
   * When aggregated, intermediate values are often dropped for the latest value.
   * </pre>
   *
   * <code>GAUGE = 2;</code>
   */
  GAUGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * InvalidMetricKind is the default value for the MetricKind. Some languages' proto compilers
   * (e.g. Go) return the default if no value is set. The default is marked invalid here to
   * avoid a common mistake where a field is left unset and appears to be set to the default.
   * </pre>
   *
   * <code>INVALID_METRIC_KIND = 0;</code>
   */
  public static final int INVALID_METRIC_KIND_VALUE = 0;
  /**
   * <pre>
   * Counter metrics measure change over an interval.
   * When aggregated, counter metrics are usually added.
   * </pre>
   *
   * <code>COUNTER = 1;</code>
   */
  public static final int COUNTER_VALUE = 1;
  /**
   * <pre>
   * Gauge metrics measure the value at a point in time.
   * When aggregated, intermediate values are often dropped for the latest value.
   * </pre>
   *
   * <code>GAUGE = 2;</code>
   */
  public static final int GAUGE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MetricKind valueOf(int value) {
    return forNumber(value);
  }

  public static MetricKind forNumber(int value) {
    switch (value) {
      case 0: return INVALID_METRIC_KIND;
      case 1: return COUNTER;
      case 2: return GAUGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetricKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetricKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetricKind>() {
          public MetricKind findValueByNumber(int number) {
            return MetricKind.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.lightstep.tracer.grpc.Metrics.getDescriptor().getEnumTypes().get(0);
  }

  private static final MetricKind[] VALUES = values();

  public static MetricKind valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MetricKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:lightstep.metrics.MetricKind)
}

