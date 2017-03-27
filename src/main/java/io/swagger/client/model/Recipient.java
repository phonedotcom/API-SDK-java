/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Recipient
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:57:25.206Z")
public class Recipient {
  @SerializedName("number")
  private String number = null;

  @SerializedName("status")
  private String status = null;

  public Recipient number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number that will receive the SMS message
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "Phone number that will receive the SMS message")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Recipient status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicate the status of your SMS object. May be 'sent', 'received', 'queued', 'new' ...
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicate the status of your SMS object. May be 'sent', 'received', 'queued', 'new' ...")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.number, recipient.number) &&
        Objects.equals(this.status, recipient.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

