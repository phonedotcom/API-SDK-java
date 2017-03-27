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
 * The Full Recording Object includes all of the properties from the Recording Summary Object, along with the following:
 */
@ApiModel(description = "The Full Recording Object includes all of the properties from the Recording Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class MediaFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public MediaFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Recording ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Recording ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MediaFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of recording
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of recording")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediaFull type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Can be hold_music or greeting. Indicates the purpose of this recording and where it can be used.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Can be hold_music or greeting. Indicates the purpose of this recording and where it can be used.")
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
    MediaFull mediaFull = (MediaFull) o;
    return Objects.equals(this.id, mediaFull.id) &&
        Objects.equals(this.name, mediaFull.name) &&
        Objects.equals(this.type, mediaFull.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

