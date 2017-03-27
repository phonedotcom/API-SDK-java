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
 * CreateTrunkParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class CreateTrunkParams {
  @SerializedName("name")
  private String name = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("max_concurrent_calls")
  private Integer maxConcurrentCalls = null;

  @SerializedName("max_minutes_per_month")
  private Integer maxMinutesPerMonth = null;

  @SerializedName("greeting")
  private Object greeting = null;

  @SerializedName("error_message")
  private Object errorMessage = null;

  @SerializedName("codecs")
  private List<Object> codecs = new ArrayList<Object>();

  public CreateTrunkParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Trunk
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of Trunk")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTrunkParams uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI of Trunk (in the form of SIP/user@host.com:port)
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "URI of Trunk (in the form of SIP/user@host.com:port)")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public CreateTrunkParams maxConcurrentCalls(Integer maxConcurrentCalls) {
    this.maxConcurrentCalls = maxConcurrentCalls;
    return this;
  }

   /**
   * Max concurrent calls
   * @return maxConcurrentCalls
  **/
  @ApiModelProperty(example = "null", value = "Max concurrent calls")
  public Integer getMaxConcurrentCalls() {
    return maxConcurrentCalls;
  }

  public void setMaxConcurrentCalls(Integer maxConcurrentCalls) {
    this.maxConcurrentCalls = maxConcurrentCalls;
  }

  public CreateTrunkParams maxMinutesPerMonth(Integer maxMinutesPerMonth) {
    this.maxMinutesPerMonth = maxMinutesPerMonth;
    return this;
  }

   /**
   * Max minutes per month
   * @return maxMinutesPerMonth
  **/
  @ApiModelProperty(example = "null", value = "Max minutes per month")
  public Integer getMaxMinutesPerMonth() {
    return maxMinutesPerMonth;
  }

  public void setMaxMinutesPerMonth(Integer maxMinutesPerMonth) {
    this.maxMinutesPerMonth = maxMinutesPerMonth;
  }

  public CreateTrunkParams greeting(Object greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Recording lookup object
   * @return greeting
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getGreeting() {
    return greeting;
  }

  public void setGreeting(Object greeting) {
    this.greeting = greeting;
  }

  public CreateTrunkParams errorMessage(Object errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Recording lookup object
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(Object errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CreateTrunkParams codecs(List<Object> codecs) {
    this.codecs = codecs;
    return this;
  }

  public CreateTrunkParams addCodecsItem(Object codecsItem) {
    this.codecs.add(codecsItem);
    return this;
  }

   /**
   * Custom audio codec configuration
   * @return codecs
  **/
  @ApiModelProperty(example = "null", value = "Custom audio codec configuration")
  public List<Object> getCodecs() {
    return codecs;
  }

  public void setCodecs(List<Object> codecs) {
    this.codecs = codecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrunkParams createTrunkParams = (CreateTrunkParams) o;
    return Objects.equals(this.name, createTrunkParams.name) &&
        Objects.equals(this.uri, createTrunkParams.uri) &&
        Objects.equals(this.maxConcurrentCalls, createTrunkParams.maxConcurrentCalls) &&
        Objects.equals(this.maxMinutesPerMonth, createTrunkParams.maxMinutesPerMonth) &&
        Objects.equals(this.greeting, createTrunkParams.greeting) &&
        Objects.equals(this.errorMessage, createTrunkParams.errorMessage) &&
        Objects.equals(this.codecs, createTrunkParams.codecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uri, maxConcurrentCalls, maxMinutesPerMonth, greeting, errorMessage, codecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrunkParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    maxConcurrentCalls: ").append(toIndentedString(maxConcurrentCalls)).append("\n");
    sb.append("    maxMinutesPerMonth: ").append(toIndentedString(maxMinutesPerMonth)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
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

