/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A CreateMediaShareRequest object
 */
@ApiModel(description = "A CreateMediaShareRequest object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T17:31:35.366+02:00")
public class CreateMediaShareRequest {
  @JsonProperty("mediaFolderId")
  private String mediaFolderId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("sentToEmails")
  private List<String> sentToEmails = null;

  @JsonProperty("accessLimit")
  private Integer accessLimit = null;

  @JsonProperty("accessUntil")
  private DateTime accessUntil = null;

  @JsonProperty("allowUpload")
  private Boolean allowUpload = null;

  @JsonProperty("uploadNotificationEmails")
  private List<String> uploadNotificationEmails = null;

  @JsonProperty("uploadHideContents")
  private Boolean uploadHideContents = null;

  @JsonProperty("mediaAllowDownload")
  private Boolean mediaAllowDownload = null;

  @JsonProperty("allowComments")
  private Boolean allowComments = null;

  public CreateMediaShareRequest mediaFolderId(String mediaFolderId) {
    this.mediaFolderId = mediaFolderId;
    return this;
  }

   /**
   * The media folder id to share
   * @return mediaFolderId
  **/
  @ApiModelProperty(value = "The media folder id to share")
  public String getMediaFolderId() {
    return mediaFolderId;
  }

  public void setMediaFolderId(String mediaFolderId) {
    this.mediaFolderId = mediaFolderId;
  }

  public CreateMediaShareRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Optional share password.
   * @return password
  **/
  @ApiModelProperty(value = "Optional share password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateMediaShareRequest sentToEmails(List<String> sentToEmails) {
    this.sentToEmails = sentToEmails;
    return this;
  }

  public CreateMediaShareRequest addSentToEmailsItem(String sentToEmailsItem) {
    if (this.sentToEmails == null) {
      this.sentToEmails = new ArrayList<String>();
    }
    this.sentToEmails.add(sentToEmailsItem);
    return this;
  }

   /**
   * Add addresses that the share have been mailed to.
   * @return sentToEmails
  **/
  @ApiModelProperty(value = "Add addresses that the share have been mailed to.")
  public List<String> getSentToEmails() {
    return sentToEmails;
  }

  public void setSentToEmails(List<String> sentToEmails) {
    this.sentToEmails = sentToEmails;
  }

  public CreateMediaShareRequest accessLimit(Integer accessLimit) {
    this.accessLimit = accessLimit;
    return this;
  }

   /**
   * Limit the number of access.
   * @return accessLimit
  **/
  @ApiModelProperty(value = "Limit the number of access.")
  public Integer getAccessLimit() {
    return accessLimit;
  }

  public void setAccessLimit(Integer accessLimit) {
    this.accessLimit = accessLimit;
  }

  public CreateMediaShareRequest accessUntil(DateTime accessUntil) {
    this.accessUntil = accessUntil;
    return this;
  }

   /**
   * Limit access to before this date.
   * @return accessUntil
  **/
  @ApiModelProperty(value = "Limit access to before this date.")
  public DateTime getAccessUntil() {
    return accessUntil;
  }

  public void setAccessUntil(DateTime accessUntil) {
    this.accessUntil = accessUntil;
  }

  public CreateMediaShareRequest allowUpload(Boolean allowUpload) {
    this.allowUpload = allowUpload;
    return this;
  }

   /**
   * Allow upload in folder.
   * @return allowUpload
  **/
  @ApiModelProperty(value = "Allow upload in folder.")
  public Boolean isAllowUpload() {
    return allowUpload;
  }

  public void setAllowUpload(Boolean allowUpload) {
    this.allowUpload = allowUpload;
  }

  public CreateMediaShareRequest uploadNotificationEmails(List<String> uploadNotificationEmails) {
    this.uploadNotificationEmails = uploadNotificationEmails;
    return this;
  }

  public CreateMediaShareRequest addUploadNotificationEmailsItem(String uploadNotificationEmailsItem) {
    if (this.uploadNotificationEmails == null) {
      this.uploadNotificationEmails = new ArrayList<String>();
    }
    this.uploadNotificationEmails.add(uploadNotificationEmailsItem);
    return this;
  }

   /**
   * Send mail to the following email addresses when files have been uploaded. (Separate call needed to send the mail).
   * @return uploadNotificationEmails
  **/
  @ApiModelProperty(value = "Send mail to the following email addresses when files have been uploaded. (Separate call needed to send the mail).")
  public List<String> getUploadNotificationEmails() {
    return uploadNotificationEmails;
  }

  public void setUploadNotificationEmails(List<String> uploadNotificationEmails) {
    this.uploadNotificationEmails = uploadNotificationEmails;
  }

  public CreateMediaShareRequest uploadHideContents(Boolean uploadHideContents) {
    this.uploadHideContents = uploadHideContents;
    return this;
  }

   /**
   * Hide the contents in the folder. (Allows upload, blocks download).
   * @return uploadHideContents
  **/
  @ApiModelProperty(value = "Hide the contents in the folder. (Allows upload, blocks download).")
  public Boolean isUploadHideContents() {
    return uploadHideContents;
  }

  public void setUploadHideContents(Boolean uploadHideContents) {
    this.uploadHideContents = uploadHideContents;
  }

  public CreateMediaShareRequest mediaAllowDownload(Boolean mediaAllowDownload) {
    this.mediaAllowDownload = mediaAllowDownload;
    return this;
  }

   /**
   * Allow download of original image.
   * @return mediaAllowDownload
  **/
  @ApiModelProperty(value = "Allow download of original image.")
  public Boolean isMediaAllowDownload() {
    return mediaAllowDownload;
  }

  public void setMediaAllowDownload(Boolean mediaAllowDownload) {
    this.mediaAllowDownload = mediaAllowDownload;
  }

  public CreateMediaShareRequest allowComments(Boolean allowComments) {
    this.allowComments = allowComments;
    return this;
  }

   /**
   * Shows Facebook comments on share page
   * @return allowComments
  **/
  @ApiModelProperty(value = "Shows Facebook comments on share page")
  public Boolean isAllowComments() {
    return allowComments;
  }

  public void setAllowComments(Boolean allowComments) {
    this.allowComments = allowComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMediaShareRequest createMediaShareRequest = (CreateMediaShareRequest) o;
    return Objects.equals(this.mediaFolderId, createMediaShareRequest.mediaFolderId) &&
        Objects.equals(this.password, createMediaShareRequest.password) &&
        Objects.equals(this.sentToEmails, createMediaShareRequest.sentToEmails) &&
        Objects.equals(this.accessLimit, createMediaShareRequest.accessLimit) &&
        Objects.equals(this.accessUntil, createMediaShareRequest.accessUntil) &&
        Objects.equals(this.allowUpload, createMediaShareRequest.allowUpload) &&
        Objects.equals(this.uploadNotificationEmails, createMediaShareRequest.uploadNotificationEmails) &&
        Objects.equals(this.uploadHideContents, createMediaShareRequest.uploadHideContents) &&
        Objects.equals(this.mediaAllowDownload, createMediaShareRequest.mediaAllowDownload) &&
        Objects.equals(this.allowComments, createMediaShareRequest.allowComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaFolderId, password, sentToEmails, accessLimit, accessUntil, allowUpload, uploadNotificationEmails, uploadHideContents, mediaAllowDownload, allowComments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMediaShareRequest {\n");
    
    sb.append("    mediaFolderId: ").append(toIndentedString(mediaFolderId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sentToEmails: ").append(toIndentedString(sentToEmails)).append("\n");
    sb.append("    accessLimit: ").append(toIndentedString(accessLimit)).append("\n");
    sb.append("    accessUntil: ").append(toIndentedString(accessUntil)).append("\n");
    sb.append("    allowUpload: ").append(toIndentedString(allowUpload)).append("\n");
    sb.append("    uploadNotificationEmails: ").append(toIndentedString(uploadNotificationEmails)).append("\n");
    sb.append("    uploadHideContents: ").append(toIndentedString(uploadHideContents)).append("\n");
    sb.append("    mediaAllowDownload: ").append(toIndentedString(mediaAllowDownload)).append("\n");
    sb.append("    allowComments: ").append(toIndentedString(allowComments)).append("\n");
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
