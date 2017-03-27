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
import io.swagger.client.model.MediaSummary;

/**
 * Voicemail Greeting Object. See below for details. Can be set to NULL to reset greeting options.
 */
@ApiModel(description = "Voicemail Greeting Object. See below for details. Can be set to NULL to reset greeting options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class Greeting {
  @SerializedName("type")
  private String type = null;

  @SerializedName("alternate")
  private MediaSummary alternate = null;

  @SerializedName("standard")
  private MediaSummary standard = null;

  @SerializedName("enable_leave_message_prompt")
  private Boolean enableLeaveMessagePrompt = null;

  public Greeting type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The greeting to play. Can be \"name\" for the name_greeting as described above, \"standard\" for the standard greeting, or \"alternate\" for an alternate greeting. See below for details.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The greeting to play. Can be \"name\" for the name_greeting as described above, \"standard\" for the standard greeting, or \"alternate\" for an alternate greeting. See below for details.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Greeting alternate(MediaSummary alternate) {
    this.alternate = alternate;
    return this;
  }

   /**
   * Greeting to be played when type=\"alternate\". Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.
   * @return alternate
  **/
  @ApiModelProperty(example = "null", value = "Greeting to be played when type=\"alternate\". Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.")
  public MediaSummary getAlternate() {
    return alternate;
  }

  public void setAlternate(MediaSummary alternate) {
    this.alternate = alternate;
  }

  public Greeting standard(MediaSummary standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Greeting to be played when type=\"standard\". Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.
   * @return standard
  **/
  @ApiModelProperty(example = "null", value = "Greeting to be played when type=\"standard\". Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.")
  public MediaSummary getStandard() {
    return standard;
  }

  public void setStandard(MediaSummary standard) {
    this.standard = standard;
  }

  public Greeting enableLeaveMessagePrompt(Boolean enableLeaveMessagePrompt) {
    this.enableLeaveMessagePrompt = enableLeaveMessagePrompt;
    return this;
  }

   /**
   * Whether to prompt the caller with the following words after the voicemail greeting has been played: \"Please leave your message after the tone. When finished, hang up or press the pound key.\" Boolean.
   * @return enableLeaveMessagePrompt
  **/
  @ApiModelProperty(example = "null", value = "Whether to prompt the caller with the following words after the voicemail greeting has been played: \"Please leave your message after the tone. When finished, hang up or press the pound key.\" Boolean.")
  public Boolean getEnableLeaveMessagePrompt() {
    return enableLeaveMessagePrompt;
  }

  public void setEnableLeaveMessagePrompt(Boolean enableLeaveMessagePrompt) {
    this.enableLeaveMessagePrompt = enableLeaveMessagePrompt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Greeting greeting = (Greeting) o;
    return Objects.equals(this.type, greeting.type) &&
        Objects.equals(this.alternate, greeting.alternate) &&
        Objects.equals(this.standard, greeting.standard) &&
        Objects.equals(this.enableLeaveMessagePrompt, greeting.enableLeaveMessagePrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alternate, standard, enableLeaveMessagePrompt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greeting {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alternate: ").append(toIndentedString(alternate)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    enableLeaveMessagePrompt: ").append(toIndentedString(enableLeaveMessagePrompt)).append("\n");
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

