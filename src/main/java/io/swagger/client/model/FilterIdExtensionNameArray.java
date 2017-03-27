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
 * FilterIdExtensionNameArray
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:57:25.206Z")
public class FilterIdExtensionNameArray {
  @SerializedName("id")
  private String id = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("name")
  private String name = null;

  public FilterIdExtensionNameArray id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FilterIdExtensionNameArray extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public FilterIdExtensionNameArray name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterIdExtensionNameArray filterIdExtensionNameArray = (FilterIdExtensionNameArray) o;
    return Objects.equals(this.id, filterIdExtensionNameArray.id) &&
        Objects.equals(this.extension, filterIdExtensionNameArray.extension) &&
        Objects.equals(this.name, filterIdExtensionNameArray.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, extension, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterIdExtensionNameArray {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

