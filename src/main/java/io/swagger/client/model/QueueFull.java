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
import io.swagger.client.model.HoldMusic;
import io.swagger.client.model.MediaSummary;
import io.swagger.client.model.Members;

/**
 * The Full QueueObject has the same properties as the Queue Summary Object, along with the following:
 */
@ApiModel(description = "The Full QueueObject has the same properties as the Queue Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class QueueFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("greeting")
  private MediaSummary greeting = null;

  @SerializedName("hold_music")
  private HoldMusic holdMusic = null;

  @SerializedName("max_hold_time")
  private Integer maxHoldTime = null;

  @SerializedName("caller_id_type")
  private String callerIdType = null;

  @SerializedName("ring_time")
  private Integer ringTime = null;

  @SerializedName("members")
  private Members members = null;

  public QueueFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Integer ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public QueueFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name. Required.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name. Required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueueFull greeting(MediaSummary greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Greeting to be played when caller first connects. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE. Can be set to NULL to disable the greeting.
   * @return greeting
  **/
  @ApiModelProperty(example = "null", value = "Greeting to be played when caller first connects. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE. Can be set to NULL to disable the greeting.")
  public MediaSummary getGreeting() {
    return greeting;
  }

  public void setGreeting(MediaSummary greeting) {
    this.greeting = greeting;
  }

  public QueueFull holdMusic(HoldMusic holdMusic) {
    this.holdMusic = holdMusic;
    return this;
  }

   /**
   * Get holdMusic
   * @return holdMusic
  **/
  @ApiModelProperty(example = "null", value = "")
  public HoldMusic getHoldMusic() {
    return holdMusic;
  }

  public void setHoldMusic(HoldMusic holdMusic) {
    this.holdMusic = holdMusic;
  }

  public QueueFull maxHoldTime(Integer maxHoldTime) {
    this.maxHoldTime = maxHoldTime;
    return this;
  }

   /**
   * Maximum hold time in seconds. If provided, must equal one of: 60, 120, 180, 240, 300, 600, 900, 1200, 1800, 2700, 3600. Default is 300.
   * @return maxHoldTime
  **/
  @ApiModelProperty(example = "null", value = "Maximum hold time in seconds. If provided, must equal one of: 60, 120, 180, 240, 300, 600, 900, 1200, 1800, 2700, 3600. Default is 300.")
  public Integer getMaxHoldTime() {
    return maxHoldTime;
  }

  public void setMaxHoldTime(Integer maxHoldTime) {
    this.maxHoldTime = maxHoldTime;
  }

  public QueueFull callerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
    return this;
  }

   /**
   * Caller id type to show members. If provided, must equal one of: 'called_number', 'calling_number'. Default is 'calling_number'.
   * @return callerIdType
  **/
  @ApiModelProperty(example = "null", value = "Caller id type to show members. If provided, must equal one of: 'called_number', 'calling_number'. Default is 'calling_number'.")
  public String getCallerIdType() {
    return callerIdType;
  }

  public void setCallerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
  }

  public QueueFull ringTime(Integer ringTime) {
    this.ringTime = ringTime;
    return this;
  }

   /**
   * Number of seconds to ring a member before cycling to the next member. If provided, must equal one of: 5, 10, 15, 20, 25, 30. Default is 5.
   * @return ringTime
  **/
  @ApiModelProperty(example = "null", value = "Number of seconds to ring a member before cycling to the next member. If provided, must equal one of: 5, 10, 15, 20, 25, 30. Default is 5.")
  public Integer getRingTime() {
    return ringTime;
  }

  public void setRingTime(Integer ringTime) {
    this.ringTime = ringTime;
  }

  public QueueFull members(Members members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "")
  public Members getMembers() {
    return members;
  }

  public void setMembers(Members members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueFull queueFull = (QueueFull) o;
    return Objects.equals(this.id, queueFull.id) &&
        Objects.equals(this.name, queueFull.name) &&
        Objects.equals(this.greeting, queueFull.greeting) &&
        Objects.equals(this.holdMusic, queueFull.holdMusic) &&
        Objects.equals(this.maxHoldTime, queueFull.maxHoldTime) &&
        Objects.equals(this.callerIdType, queueFull.callerIdType) &&
        Objects.equals(this.ringTime, queueFull.ringTime) &&
        Objects.equals(this.members, queueFull.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, greeting, holdMusic, maxHoldTime, callerIdType, ringTime, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    holdMusic: ").append(toIndentedString(holdMusic)).append("\n");
    sb.append("    maxHoldTime: ").append(toIndentedString(maxHoldTime)).append("\n");
    sb.append("    callerIdType: ").append(toIndentedString(callerIdType)).append("\n");
    sb.append("    ringTime: ").append(toIndentedString(ringTime)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

