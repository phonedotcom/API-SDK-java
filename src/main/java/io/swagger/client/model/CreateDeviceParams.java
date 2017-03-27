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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateDeviceParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class CreateDeviceParams {
  @SerializedName("name")
  private String name = null;

  @SerializedName("lines")
  private List<Object> lines = new ArrayList<Object>();

  public CreateDeviceParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Device Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Device Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateDeviceParams lines(List<Object> lines) {
    this.lines = lines;
    return this;
  }

  public CreateDeviceParams addLinesItem(Object linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * List of line objects
   * @return lines
  **/
  @ApiModelProperty(example = "null", value = "List of line objects")
  public List<Object> getLines() {
    return lines;
  }

  public void setLines(List<Object> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDeviceParams createDeviceParams = (CreateDeviceParams) o;
    return Objects.equals(this.name, createDeviceParams.name) &&
        Objects.equals(this.lines, createDeviceParams.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDeviceParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

