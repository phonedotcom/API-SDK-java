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
 * A SIP Authentication Properties Object. See below for details. Read-only.
 */
@ApiModel(description = "A SIP Authentication Properties Object. See below for details. Read-only.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T10:57:25.206Z")
public class SipAuthentication {
  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  public SipAuthentication host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Hostname
   * @return host
  **/
  @ApiModelProperty(example = "null", value = "Hostname")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SipAuthentication port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number
   * @return port
  **/
  @ApiModelProperty(example = "null", value = "Port number")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SipAuthentication username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username. This is the ID of the device.
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "Username. This is the ID of the device.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SipAuthentication password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password.
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipAuthentication sipAuthentication = (SipAuthentication) o;
    return Objects.equals(this.host, sipAuthentication.host) &&
        Objects.equals(this.port, sipAuthentication.port) &&
        Objects.equals(this.username, sipAuthentication.username) &&
        Objects.equals(this.password, sipAuthentication.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipAuthentication {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

