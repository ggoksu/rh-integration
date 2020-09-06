/*
 * Device
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T15:36:58.513+03:00")
public class DeviceRequest {
  @SerializedName("caller-id")
  private String callerId = null;

  @SerializedName("msisdn")
  private String msisdn = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("size")
  private String size = null;

  public DeviceRequest callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Get callerId
   * @return callerId
  **/
  @ApiModelProperty(value = "")
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public DeviceRequest msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(value = "")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public DeviceRequest brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public DeviceRequest model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceRequest color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DeviceRequest size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRequest deviceRequest = (DeviceRequest) o;
    return Objects.equals(this.callerId, deviceRequest.callerId) &&
        Objects.equals(this.msisdn, deviceRequest.msisdn) &&
        Objects.equals(this.brand, deviceRequest.brand) &&
        Objects.equals(this.model, deviceRequest.model) &&
        Objects.equals(this.color, deviceRequest.color) &&
        Objects.equals(this.size, deviceRequest.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerId, msisdn, brand, model, color, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRequest {\n");
    
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
