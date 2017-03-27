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
 * Here are all of the properties you can expect for Caller ID objects:
 */
@ApiModel(description = "Here are all of the properties you can expect for Caller ID objects:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:57:25.206Z")
public class CallerIdPhoneNumber {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public CallerIdPhoneNumber name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name that this number will be associated with. Must be no longer than 15 characters, and can only contain English letters, numbers, spaces, and commas.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name that this number will be associated with. Must be no longer than 15 characters, and can only contain English letters, numbers, spaces, and commas.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CallerIdPhoneNumber type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Can be \"business\" or \"personal\"
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Can be \"business\" or \"personal\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallerIdPhoneNumber callerIdPhoneNumber = (CallerIdPhoneNumber) o;
    return Objects.equals(this.name, callerIdPhoneNumber.name) &&
        Objects.equals(this.type, callerIdPhoneNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallerIdPhoneNumber {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

