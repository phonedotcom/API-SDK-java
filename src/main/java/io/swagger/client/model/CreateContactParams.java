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
 * CreateContactParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class CreateContactParams {
  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("phonetic_first_name")
  private String phoneticFirstName = null;

  @SerializedName("phonetic_middle_name")
  private String phoneticMiddleName = null;

  @SerializedName("phonetic_last_name")
  private String phoneticLastName = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("emails")
  private List<Object> emails = new ArrayList<Object>();

  @SerializedName("phone_numbers")
  private List<Object> phoneNumbers = new ArrayList<Object>();

  @SerializedName("addresses")
  private List<Object> addresses = new ArrayList<Object>();

  @SerializedName("group")
  private Object group = null;

  public CreateContactParams firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First Name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateContactParams middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle Name
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "Middle Name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public CreateContactParams lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last Name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateContactParams prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "Prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public CreateContactParams phoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
    return this;
  }

   /**
   * Phonetic First Name
   * @return phoneticFirstName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic First Name")
  public String getPhoneticFirstName() {
    return phoneticFirstName;
  }

  public void setPhoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
  }

  public CreateContactParams phoneticMiddleName(String phoneticMiddleName) {
    this.phoneticMiddleName = phoneticMiddleName;
    return this;
  }

   /**
   * Phonetic Middle Name
   * @return phoneticMiddleName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic Middle Name")
  public String getPhoneticMiddleName() {
    return phoneticMiddleName;
  }

  public void setPhoneticMiddleName(String phoneticMiddleName) {
    this.phoneticMiddleName = phoneticMiddleName;
  }

  public CreateContactParams phoneticLastName(String phoneticLastName) {
    this.phoneticLastName = phoneticLastName;
    return this;
  }

   /**
   * Phonetic Last Name
   * @return phoneticLastName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic Last Name")
  public String getPhoneticLastName() {
    return phoneticLastName;
  }

  public void setPhoneticLastName(String phoneticLastName) {
    this.phoneticLastName = phoneticLastName;
  }

  public CreateContactParams suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix
   * @return suffix
  **/
  @ApiModelProperty(example = "null", value = "Suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CreateContactParams nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Nickname
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "Nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public CreateContactParams company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company Name
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "Company Name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public CreateContactParams department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Department Name
   * @return department
  **/
  @ApiModelProperty(example = "null", value = "Department Name")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public CreateContactParams jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Job Title
   * @return jobTitle
  **/
  @ApiModelProperty(example = "null", value = "Job Title")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public CreateContactParams emails(List<Object> emails) {
    this.emails = emails;
    return this;
  }

  public CreateContactParams addEmailsItem(Object emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Email Addresses
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "Email Addresses")
  public List<Object> getEmails() {
    return emails;
  }

  public void setEmails(List<Object> emails) {
    this.emails = emails;
  }

  public CreateContactParams phoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public CreateContactParams addPhoneNumbersItem(Object phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Phone Numbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "Phone Numbers")
  public List<Object> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public CreateContactParams addresses(List<Object> addresses) {
    this.addresses = addresses;
    return this;
  }

  public CreateContactParams addAddressesItem(Object addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "Addresses")
  public List<Object> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Object> addresses) {
    this.addresses = addresses;
  }

  public CreateContactParams group(Object group) {
    this.group = group;
    return this;
  }

   /**
   * Contact Group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "Contact Group")
  public Object getGroup() {
    return group;
  }

  public void setGroup(Object group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContactParams createContactParams = (CreateContactParams) o;
    return Objects.equals(this.firstName, createContactParams.firstName) &&
        Objects.equals(this.middleName, createContactParams.middleName) &&
        Objects.equals(this.lastName, createContactParams.lastName) &&
        Objects.equals(this.prefix, createContactParams.prefix) &&
        Objects.equals(this.phoneticFirstName, createContactParams.phoneticFirstName) &&
        Objects.equals(this.phoneticMiddleName, createContactParams.phoneticMiddleName) &&
        Objects.equals(this.phoneticLastName, createContactParams.phoneticLastName) &&
        Objects.equals(this.suffix, createContactParams.suffix) &&
        Objects.equals(this.nickname, createContactParams.nickname) &&
        Objects.equals(this.company, createContactParams.company) &&
        Objects.equals(this.department, createContactParams.department) &&
        Objects.equals(this.jobTitle, createContactParams.jobTitle) &&
        Objects.equals(this.emails, createContactParams.emails) &&
        Objects.equals(this.phoneNumbers, createContactParams.phoneNumbers) &&
        Objects.equals(this.addresses, createContactParams.addresses) &&
        Objects.equals(this.group, createContactParams.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, prefix, phoneticFirstName, phoneticMiddleName, phoneticLastName, suffix, nickname, company, department, jobTitle, emails, phoneNumbers, addresses, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContactParams {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    phoneticFirstName: ").append(toIndentedString(phoneticFirstName)).append("\n");
    sb.append("    phoneticMiddleName: ").append(toIndentedString(phoneticMiddleName)).append("\n");
    sb.append("    phoneticLastName: ").append(toIndentedString(phoneticLastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

