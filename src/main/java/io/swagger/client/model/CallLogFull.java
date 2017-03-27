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
import io.swagger.client.model.CallDetails;
import io.swagger.client.model.ExtensionSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * The Full Call Log Object includes the properties in the Call Log Summary Object, along with the following:
 */
@ApiModel(description = "The Full Call Log Object includes the properties in the Call Log Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:12:11.926Z")
public class CallLogFull {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("extension")
  private ExtensionSummary extension = null;

  @SerializedName("caller_id")
  private String callerId = null;

  @SerializedName("called_number")
  private String calledNumber = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("call_duration")
  private Integer callDuration = null;

  @SerializedName("is_monitored")
  private String isMonitored = null;

  @SerializedName("call_number")
  private String callNumber = null;

  @SerializedName("final_action")
  private String finalAction = null;

  @SerializedName("call_recording")
  private String callRecording = null;

  @SerializedName("details")
  private List<CallDetails> details = new ArrayList<CallDetails>();

  @SerializedName("caller_cnam")
  private String callerCnam = null;

  public CallLogFull id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CallLogFull uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Internal system id, may be null
   * @return uuid
  **/
  @ApiModelProperty(example = "null", value = "Internal system id, may be null")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public CallLogFull extension(ExtensionSummary extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Account extension
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Account extension")
  public ExtensionSummary getExtension() {
    return extension;
  }

  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }

  public CallLogFull callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Call made from this phone number
   * @return callerId
  **/
  @ApiModelProperty(example = "null", value = "Call made from this phone number")
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public CallLogFull calledNumber(String calledNumber) {
    this.calledNumber = calledNumber;
    return this;
  }

   /**
   * Call made to this phone number
   * @return calledNumber
  **/
  @ApiModelProperty(example = "null", value = "Call made to this phone number")
  public String getCalledNumber() {
    return calledNumber;
  }

  public void setCalledNumber(String calledNumber) {
    this.calledNumber = calledNumber;
  }

  public CallLogFull startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Call start time
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "Call start time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public CallLogFull createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Call log creation time. Same as call end time + time needed to create call log
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Call log creation time. Same as call end time + time needed to create call log")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CallLogFull direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Call direction: in or out
   * @return direction
  **/
  @ApiModelProperty(example = "null", value = "Call direction: in or out")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public CallLogFull type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Call type: call, fax, audiogram ...
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Call type: call, fax, audiogram ...")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CallLogFull callDuration(Integer callDuration) {
    this.callDuration = callDuration;
    return this;
  }

   /**
   * Call duration in seconds
   * @return callDuration
  **/
  @ApiModelProperty(example = "null", value = "Call duration in seconds")
  public Integer getCallDuration() {
    return callDuration;
  }

  public void setCallDuration(Integer callDuration) {
    this.callDuration = callDuration;
  }

  public CallLogFull isMonitored(String isMonitored) {
    this.isMonitored = isMonitored;
    return this;
  }

   /**
   * Was call being monitored?
   * @return isMonitored
  **/
  @ApiModelProperty(example = "null", value = "Was call being monitored?")
  public String getIsMonitored() {
    return isMonitored;
  }

  public void setIsMonitored(String isMonitored) {
    this.isMonitored = isMonitored;
  }

  public CallLogFull callNumber(String callNumber) {
    this.callNumber = callNumber;
    return this;
  }

   /**
   * Internal system call reference number
   * @return callNumber
  **/
  @ApiModelProperty(example = "null", value = "Internal system call reference number")
  public String getCallNumber() {
    return callNumber;
  }

  public void setCallNumber(String callNumber) {
    this.callNumber = callNumber;
  }

  public CallLogFull finalAction(String finalAction) {
    this.finalAction = finalAction;
    return this;
  }

   /**
   * Last action of call flow
   * @return finalAction
  **/
  @ApiModelProperty(example = "null", value = "Last action of call flow")
  public String getFinalAction() {
    return finalAction;
  }

  public void setFinalAction(String finalAction) {
    this.finalAction = finalAction;
  }

  public CallLogFull callRecording(String callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * URL of call recording if available. Empty string if call recording does not exist
   * @return callRecording
  **/
  @ApiModelProperty(example = "null", value = "URL of call recording if available. Empty string if call recording does not exist")
  public String getCallRecording() {
    return callRecording;
  }

  public void setCallRecording(String callRecording) {
    this.callRecording = callRecording;
  }

  public CallLogFull details(List<CallDetails> details) {
    this.details = details;
    return this;
  }

  public CallLogFull addDetailsItem(CallDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * A list of call flows from beginning of call to end of call.
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "A list of call flows from beginning of call to end of call.")
  public List<CallDetails> getDetails() {
    return details;
  }

  public void setDetails(List<CallDetails> details) {
    this.details = details;
  }

  public CallLogFull callerCnam(String callerCnam) {
    this.callerCnam = callerCnam;
    return this;
  }

   /**
   * Internal system caller id / name
   * @return callerCnam
  **/
  @ApiModelProperty(example = "null", value = "Internal system caller id / name")
  public String getCallerCnam() {
    return callerCnam;
  }

  public void setCallerCnam(String callerCnam) {
    this.callerCnam = callerCnam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallLogFull callLogFull = (CallLogFull) o;
    return Objects.equals(this.id, callLogFull.id) &&
        Objects.equals(this.uuid, callLogFull.uuid) &&
        Objects.equals(this.extension, callLogFull.extension) &&
        Objects.equals(this.callerId, callLogFull.callerId) &&
        Objects.equals(this.calledNumber, callLogFull.calledNumber) &&
        Objects.equals(this.startTime, callLogFull.startTime) &&
        Objects.equals(this.createdAt, callLogFull.createdAt) &&
        Objects.equals(this.direction, callLogFull.direction) &&
        Objects.equals(this.type, callLogFull.type) &&
        Objects.equals(this.callDuration, callLogFull.callDuration) &&
        Objects.equals(this.isMonitored, callLogFull.isMonitored) &&
        Objects.equals(this.callNumber, callLogFull.callNumber) &&
        Objects.equals(this.finalAction, callLogFull.finalAction) &&
        Objects.equals(this.callRecording, callLogFull.callRecording) &&
        Objects.equals(this.details, callLogFull.details) &&
        Objects.equals(this.callerCnam, callLogFull.callerCnam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, extension, callerId, calledNumber, startTime, createdAt, direction, type, callDuration, isMonitored, callNumber, finalAction, callRecording, details, callerCnam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallLogFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    calledNumber: ").append(toIndentedString(calledNumber)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
    sb.append("    isMonitored: ").append(toIndentedString(isMonitored)).append("\n");
    sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
    sb.append("    finalAction: ").append(toIndentedString(finalAction)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    callerCnam: ").append(toIndentedString(callerCnam)).append("\n");
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

