// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/address.proto

package com.grpc.models;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 postBox = 1;</code>
   * @return The postBox.
   */
  int getPostBox();

  /**
   * <code>string street = 2;</code>
   * @return The street.
   */
  java.lang.String getStreet();
  /**
   * <code>string street = 2;</code>
   * @return The bytes for street.
   */
  com.google.protobuf.ByteString
      getStreetBytes();

  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();
}
