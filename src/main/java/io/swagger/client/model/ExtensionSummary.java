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
 * The Extension Summary Object is used to briefly represent an extension. It can be seen in several places throughout this API. Here are the properties:
 */
@ApiModel(description = "The Extension Summary Object is used to briefly represent an extension. It can be seen in several places throughout this API. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class ExtensionSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("extension")
  private Integer extension = null;

  public ExtensionSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExtensionSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensionSummary extension(Integer extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.")
  public Integer getExtension() {
    return extension;
  }

  public void setExtension(Integer extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionSummary extensionSummary = (ExtensionSummary) o;
    return Objects.equals(this.id, extensionSummary.id) &&
        Objects.equals(this.name, extensionSummary.name) &&
        Objects.equals(this.extension, extensionSummary.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

