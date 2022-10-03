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
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [PipelineService.ListPipelineJobs][google.cloud.aiplatform.v1beta1.PipelineService.ListPipelineJobs]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse}
 */
public final class ListPipelineJobsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse)
    ListPipelineJobsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPipelineJobsResponse.newBuilder() to construct.
  private ListPipelineJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPipelineJobsResponse() {
    pipelineJobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPipelineJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.Builder.class);
  }

  public static final int PIPELINE_JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob> pipelineJobs_;
  /**
   *
   *
   * <pre>
   * List of PipelineJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob> getPipelineJobsList() {
    return pipelineJobs_;
  }
  /**
   *
   *
   * <pre>
   * List of PipelineJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
      getPipelineJobsOrBuilderList() {
    return pipelineJobs_;
  }
  /**
   *
   *
   * <pre>
   * List of PipelineJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  @java.lang.Override
  public int getPipelineJobsCount() {
    return pipelineJobs_.size();
  }
  /**
   *
   *
   * <pre>
   * List of PipelineJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PipelineJob getPipelineJobs(int index) {
    return pipelineJobs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of PipelineJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder getPipelineJobsOrBuilder(
      int index) {
    return pipelineJobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
    for (int i = 0; i < pipelineJobs_.size(); i++) {
      output.writeMessage(1, pipelineJobs_.get(i));
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
    for (int i = 0; i < pipelineJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, pipelineJobs_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse) obj;

    if (!getPipelineJobsList().equals(other.getPipelineJobsList())) return false;
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
    if (getPipelineJobsCount() > 0) {
      hash = (37 * hash) + PIPELINE_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getPipelineJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse prototype) {
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
   * Response message for [PipelineService.ListPipelineJobs][google.cloud.aiplatform.v1beta1.PipelineService.ListPipelineJobs]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse)
      com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pipelineJobsBuilder_ == null) {
        pipelineJobs_ = java.util.Collections.emptyList();
      } else {
        pipelineJobs_ = null;
        pipelineJobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PipelineServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (pipelineJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pipelineJobs_ = java.util.Collections.unmodifiableList(pipelineJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pipelineJobs_ = pipelineJobs_;
      } else {
        result.pipelineJobs_ = pipelineJobsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse.getDefaultInstance())
        return this;
      if (pipelineJobsBuilder_ == null) {
        if (!other.pipelineJobs_.isEmpty()) {
          if (pipelineJobs_.isEmpty()) {
            pipelineJobs_ = other.pipelineJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePipelineJobsIsMutable();
            pipelineJobs_.addAll(other.pipelineJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.pipelineJobs_.isEmpty()) {
          if (pipelineJobsBuilder_.isEmpty()) {
            pipelineJobsBuilder_.dispose();
            pipelineJobsBuilder_ = null;
            pipelineJobs_ = other.pipelineJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pipelineJobsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPipelineJobsFieldBuilder()
                    : null;
          } else {
            pipelineJobsBuilder_.addAllMessages(other.pipelineJobs_);
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
                com.google.cloud.aiplatform.v1beta1.PipelineJob m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.PipelineJob.parser(),
                        extensionRegistry);
                if (pipelineJobsBuilder_ == null) {
                  ensurePipelineJobsIsMutable();
                  pipelineJobs_.add(m);
                } else {
                  pipelineJobsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob> pipelineJobs_ =
        java.util.Collections.emptyList();

    private void ensurePipelineJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pipelineJobs_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.PipelineJob>(pipelineJobs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PipelineJob,
            com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
            com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
        pipelineJobsBuilder_;

    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob> getPipelineJobsList() {
      if (pipelineJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pipelineJobs_);
      } else {
        return pipelineJobsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public int getPipelineJobsCount() {
      if (pipelineJobsBuilder_ == null) {
        return pipelineJobs_.size();
      } else {
        return pipelineJobsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob getPipelineJobs(int index) {
      if (pipelineJobsBuilder_ == null) {
        return pipelineJobs_.get(index);
      } else {
        return pipelineJobsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder setPipelineJobs(
        int index, com.google.cloud.aiplatform.v1beta1.PipelineJob value) {
      if (pipelineJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineJobsIsMutable();
        pipelineJobs_.set(index, value);
        onChanged();
      } else {
        pipelineJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder setPipelineJobs(
        int index, com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder builderForValue) {
      if (pipelineJobsBuilder_ == null) {
        ensurePipelineJobsIsMutable();
        pipelineJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        pipelineJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder addPipelineJobs(com.google.cloud.aiplatform.v1beta1.PipelineJob value) {
      if (pipelineJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineJobsIsMutable();
        pipelineJobs_.add(value);
        onChanged();
      } else {
        pipelineJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder addPipelineJobs(
        int index, com.google.cloud.aiplatform.v1beta1.PipelineJob value) {
      if (pipelineJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePipelineJobsIsMutable();
        pipelineJobs_.add(index, value);
        onChanged();
      } else {
        pipelineJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder addPipelineJobs(
        com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder builderForValue) {
      if (pipelineJobsBuilder_ == null) {
        ensurePipelineJobsIsMutable();
        pipelineJobs_.add(builderForValue.build());
        onChanged();
      } else {
        pipelineJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder addPipelineJobs(
        int index, com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder builderForValue) {
      if (pipelineJobsBuilder_ == null) {
        ensurePipelineJobsIsMutable();
        pipelineJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        pipelineJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder addAllPipelineJobs(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.PipelineJob> values) {
      if (pipelineJobsBuilder_ == null) {
        ensurePipelineJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, pipelineJobs_);
        onChanged();
      } else {
        pipelineJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder clearPipelineJobs() {
      if (pipelineJobsBuilder_ == null) {
        pipelineJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pipelineJobsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public Builder removePipelineJobs(int index) {
      if (pipelineJobsBuilder_ == null) {
        ensurePipelineJobsIsMutable();
        pipelineJobs_.remove(index);
        onChanged();
      } else {
        pipelineJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder getPipelineJobsBuilder(
        int index) {
      return getPipelineJobsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder getPipelineJobsOrBuilder(
        int index) {
      if (pipelineJobsBuilder_ == null) {
        return pipelineJobs_.get(index);
      } else {
        return pipelineJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
        getPipelineJobsOrBuilderList() {
      if (pipelineJobsBuilder_ != null) {
        return pipelineJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pipelineJobs_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder addPipelineJobsBuilder() {
      return getPipelineJobsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder addPipelineJobsBuilder(
        int index) {
      return getPipelineJobsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.PipelineJob.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of PipelineJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder>
        getPipelineJobsBuilderList() {
      return getPipelineJobsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PipelineJob,
            com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
            com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>
        getPipelineJobsFieldBuilder() {
      if (pipelineJobsBuilder_ == null) {
        pipelineJobsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.PipelineJob,
                com.google.cloud.aiplatform.v1beta1.PipelineJob.Builder,
                com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder>(
                pipelineJobs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        pipelineJobs_ = null;
      }
      return pipelineJobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to [ListPipelineJobsRequest.page_token][google.cloud.aiplatform.v1beta1.ListPipelineJobsRequest.page_token] to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPipelineJobsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPipelineJobsResponse>() {
        @java.lang.Override
        public ListPipelineJobsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPipelineJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPipelineJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListPipelineJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
