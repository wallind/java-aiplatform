/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [TensorboardService.ListTensorboardRuns][google.cloud.aiplatform.v1beta1.TensorboardService.ListTensorboardRuns].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse}
 */
public final class ListTensorboardRunsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse)
    ListTensorboardRunsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTensorboardRunsResponse.newBuilder() to construct.
  private ListTensorboardRunsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTensorboardRunsResponse() {
    tensorboardRuns_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTensorboardRunsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListTensorboardRunsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListTensorboardRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.Builder.class);
  }

  public static final int TENSORBOARD_RUNS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardRun> tensorboardRuns_;
  /**
   *
   *
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardRun>
      getTensorboardRunsList() {
    return tensorboardRuns_;
  }
  /**
   *
   *
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
      getTensorboardRunsOrBuilderList() {
    return tensorboardRuns_;
  }
  /**
   *
   *
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public int getTensorboardRunsCount() {
    return tensorboardRuns_.size();
  }
  /**
   *
   *
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRuns(int index) {
    return tensorboardRuns_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
      int index) {
    return tensorboardRuns_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < tensorboardRuns_.size(); i++) {
      output.writeMessage(1, tensorboardRuns_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tensorboardRuns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tensorboardRuns_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse) obj;

    if (!getTensorboardRunsList().equals(other.getTensorboardRunsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTensorboardRunsCount() > 0) {
      hash = (37 * hash) + TENSORBOARD_RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getTensorboardRunsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for [TensorboardService.ListTensorboardRuns][google.cloud.aiplatform.v1beta1.TensorboardService.ListTensorboardRuns].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse)
      com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTensorboardRunsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTensorboardRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRuns_ = java.util.Collections.emptyList();
      } else {
        tensorboardRuns_ = null;
        tensorboardRunsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListTensorboardRunsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse(this);
      int from_bitField0_ = bitField0_;
      if (tensorboardRunsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensorboardRuns_ = java.util.Collections.unmodifiableList(tensorboardRuns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensorboardRuns_ = tensorboardRuns_;
      } else {
        result.tensorboardRuns_ = tensorboardRunsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse.getDefaultInstance())
        return this;
      if (tensorboardRunsBuilder_ == null) {
        if (!other.tensorboardRuns_.isEmpty()) {
          if (tensorboardRuns_.isEmpty()) {
            tensorboardRuns_ = other.tensorboardRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorboardRunsIsMutable();
            tensorboardRuns_.addAll(other.tensorboardRuns_);
          }
          onChanged();
        }
      } else {
        if (!other.tensorboardRuns_.isEmpty()) {
          if (tensorboardRunsBuilder_.isEmpty()) {
            tensorboardRunsBuilder_.dispose();
            tensorboardRunsBuilder_ = null;
            tensorboardRuns_ = other.tensorboardRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorboardRunsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTensorboardRunsFieldBuilder()
                    : null;
          } else {
            tensorboardRunsBuilder_.addAllMessages(other.tensorboardRuns_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.cloud.aiplatform.v1beta1.TensorboardRun m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.TensorboardRun.parser(),
                        extensionRegistry);
                if (tensorboardRunsBuilder_ == null) {
                  ensureTensorboardRunsIsMutable();
                  tensorboardRuns_.add(m);
                } else {
                  tensorboardRunsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardRun> tensorboardRuns_ =
        java.util.Collections.emptyList();

    private void ensureTensorboardRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensorboardRuns_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.TensorboardRun>(
                tensorboardRuns_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardRun,
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
        tensorboardRunsBuilder_;

    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardRun>
        getTensorboardRunsList() {
      if (tensorboardRunsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensorboardRuns_);
      } else {
        return tensorboardRunsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public int getTensorboardRunsCount() {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.size();
      } else {
        return tensorboardRunsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun getTensorboardRuns(int index) {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.get(index);
      } else {
        return tensorboardRunsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder setTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.set(index, value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder setTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardRun value) {
      if (tensorboardRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(index, value);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addTensorboardRuns(
        int index, com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder builderForValue) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorboardRunsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder addAllTensorboardRuns(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.TensorboardRun> values) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tensorboardRuns_);
        onChanged();
      } else {
        tensorboardRunsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder clearTensorboardRuns() {
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorboardRunsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public Builder removeTensorboardRuns(int index) {
      if (tensorboardRunsBuilder_ == null) {
        ensureTensorboardRunsIsMutable();
        tensorboardRuns_.remove(index);
        onChanged();
      } else {
        tensorboardRunsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder getTensorboardRunsBuilder(
        int index) {
      return getTensorboardRunsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
        int index) {
      if (tensorboardRunsBuilder_ == null) {
        return tensorboardRuns_.get(index);
      } else {
        return tensorboardRunsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
        getTensorboardRunsOrBuilderList() {
      if (tensorboardRunsBuilder_ != null) {
        return tensorboardRunsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensorboardRuns_);
      }
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder addTensorboardRunsBuilder() {
      return getTensorboardRunsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder addTensorboardRunsBuilder(
        int index) {
      return getTensorboardRunsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1beta1.TensorboardRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The TensorboardRuns mathching the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.TensorboardRun tensorboard_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder>
        getTensorboardRunsBuilderList() {
      return getTensorboardRunsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.TensorboardRun,
            com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
            com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>
        getTensorboardRunsFieldBuilder() {
      if (tensorboardRunsBuilder_ == null) {
        tensorboardRunsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.TensorboardRun,
                com.google.cloud.aiplatform.v1beta1.TensorboardRun.Builder,
                com.google.cloud.aiplatform.v1beta1.TensorboardRunOrBuilder>(
                tensorboardRuns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensorboardRuns_ = null;
      }
      return tensorboardRunsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1beta1.ListTensorboardRunsRequest.page_token] to
     * retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTensorboardRunsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTensorboardRunsResponse>() {
        @java.lang.Override
        public ListTensorboardRunsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListTensorboardRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTensorboardRunsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListTensorboardRunsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
