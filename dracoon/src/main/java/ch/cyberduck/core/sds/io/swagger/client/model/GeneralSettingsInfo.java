/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-08-24 08:39:45<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.23.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * General settings
 */
@Schema(description = "General settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-31T11:26:27.086143+02:00[Europe/Zurich]")
public class GeneralSettingsInfo {
  @JsonProperty("sharePasswordSmsEnabled")
  private Boolean sharePasswordSmsEnabled = null;

  @JsonProperty("cryptoEnabled")
  private Boolean cryptoEnabled = null;

  @JsonProperty("emailNotificationButtonEnabled")
  private Boolean emailNotificationButtonEnabled = null;

  @JsonProperty("eulaEnabled")
  private Boolean eulaEnabled = null;

  @JsonProperty("weakPasswordEnabled")
  private Boolean weakPasswordEnabled = null;

  @JsonProperty("useS3Storage")
  private Boolean useS3Storage = null;

  @JsonProperty("s3TagsEnabled")
  private Boolean s3TagsEnabled = null;

  @JsonProperty("homeRoomsActive")
  private Boolean homeRoomsActive = null;

  @JsonProperty("homeRoomParentId")
  private Long homeRoomParentId = null;

  @JsonProperty("mediaServerEnabled")
  private Boolean mediaServerEnabled = null;

  public GeneralSettingsInfo sharePasswordSmsEnabled(Boolean sharePasswordSmsEnabled) {
    this.sharePasswordSmsEnabled = sharePasswordSmsEnabled;
    return this;
  }

   /**
   * Allow sending of share passwords via SMS
   * @return sharePasswordSmsEnabled
  **/
  @Schema(description = "Allow sending of share passwords via SMS")
  public Boolean isSharePasswordSmsEnabled() {
    return sharePasswordSmsEnabled;
  }

  public void setSharePasswordSmsEnabled(Boolean sharePasswordSmsEnabled) {
    this.sharePasswordSmsEnabled = sharePasswordSmsEnabled;
  }

  public GeneralSettingsInfo cryptoEnabled(Boolean cryptoEnabled) {
    this.cryptoEnabled = cryptoEnabled;
    return this;
  }

   /**
   * Activation status of client-side encryption.  Can only be enabled once; disabling is not possible.
   * @return cryptoEnabled
  **/
  @Schema(description = "Activation status of client-side encryption.  Can only be enabled once; disabling is not possible.")
  public Boolean isCryptoEnabled() {
    return cryptoEnabled;
  }

  public void setCryptoEnabled(Boolean cryptoEnabled) {
    this.cryptoEnabled = cryptoEnabled;
  }

  public GeneralSettingsInfo emailNotificationButtonEnabled(Boolean emailNotificationButtonEnabled) {
    this.emailNotificationButtonEnabled = emailNotificationButtonEnabled;
    return this;
  }

   /**
   * Enable email notification button
   * @return emailNotificationButtonEnabled
  **/
  @Schema(description = "Enable email notification button")
  public Boolean isEmailNotificationButtonEnabled() {
    return emailNotificationButtonEnabled;
  }

  public void setEmailNotificationButtonEnabled(Boolean emailNotificationButtonEnabled) {
    this.emailNotificationButtonEnabled = emailNotificationButtonEnabled;
  }

  public GeneralSettingsInfo eulaEnabled(Boolean eulaEnabled) {
    this.eulaEnabled = eulaEnabled;
    return this;
  }

   /**
   * Each user has to confirm the EULA at first login.
   * @return eulaEnabled
  **/
  @Schema(description = "Each user has to confirm the EULA at first login.")
  public Boolean isEulaEnabled() {
    return eulaEnabled;
  }

  public void setEulaEnabled(Boolean eulaEnabled) {
    this.eulaEnabled = eulaEnabled;
  }

  public GeneralSettingsInfo weakPasswordEnabled(Boolean weakPasswordEnabled) {
    this.weakPasswordEnabled = weakPasswordEnabled;
    return this;
  }

   /**
   * Allow weak password  * A weak password has to fulfill the following criteria:     * is at least 8 characters long     * contains letters and numbers  * A strong password has to fulfill the following criteria in addition:     * contains at least one special character     * contains upper and lower case characters
   * @return weakPasswordEnabled
  **/
  @Schema(description = "Allow weak password  * A weak password has to fulfill the following criteria:     * is at least 8 characters long     * contains letters and numbers  * A strong password has to fulfill the following criteria in addition:     * contains at least one special character     * contains upper and lower case characters")
  public Boolean isWeakPasswordEnabled() {
    return weakPasswordEnabled;
  }

  public void setWeakPasswordEnabled(Boolean weakPasswordEnabled) {
    this.weakPasswordEnabled = weakPasswordEnabled;
  }

  public GeneralSettingsInfo useS3Storage(Boolean useS3Storage) {
    this.useS3Storage = useS3Storage;
    return this;
  }

   /**
   * Defines if S3 is used as storage backend
   * @return useS3Storage
  **/
  @Schema(description = "Defines if S3 is used as storage backend")
  public Boolean isUseS3Storage() {
    return useS3Storage;
  }

  public void setUseS3Storage(Boolean useS3Storage) {
    this.useS3Storage = useS3Storage;
  }

  public GeneralSettingsInfo s3TagsEnabled(Boolean s3TagsEnabled) {
    this.s3TagsEnabled = s3TagsEnabled;
    return this;
  }

   /**
   * &amp;#128640; Since v4.9.0  Defines if S3 tags are enabled
   * @return s3TagsEnabled
  **/
  @Schema(description = "&#128640; Since v4.9.0  Defines if S3 tags are enabled")
  public Boolean isS3TagsEnabled() {
    return s3TagsEnabled;
  }

  public void setS3TagsEnabled(Boolean s3TagsEnabled) {
    this.s3TagsEnabled = s3TagsEnabled;
  }

  public GeneralSettingsInfo homeRoomsActive(Boolean homeRoomsActive) {
    this.homeRoomsActive = homeRoomsActive;
    return this;
  }

   /**
   * &amp;#128640; Since v4.10.0  Homerooms active
   * @return homeRoomsActive
  **/
  @Schema(description = "&#128640; Since v4.10.0  Homerooms active")
  public Boolean isHomeRoomsActive() {
    return homeRoomsActive;
  }

  public void setHomeRoomsActive(Boolean homeRoomsActive) {
    this.homeRoomsActive = homeRoomsActive;
  }

  public GeneralSettingsInfo homeRoomParentId(Long homeRoomParentId) {
    this.homeRoomParentId = homeRoomParentId;
    return this;
  }

   /**
   * &amp;#128640; Since v4.10.0  Homeroom Parent ID
   * @return homeRoomParentId
  **/
  @Schema(description = "&#128640; Since v4.10.0  Homeroom Parent ID")
  public Long getHomeRoomParentId() {
    return homeRoomParentId;
  }

  public void setHomeRoomParentId(Long homeRoomParentId) {
    this.homeRoomParentId = homeRoomParentId;
  }

  public GeneralSettingsInfo mediaServerEnabled(Boolean mediaServerEnabled) {
    this.mediaServerEnabled = mediaServerEnabled;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.12.0  Determines if the media server is enabled
   * @return mediaServerEnabled
  **/
  @Schema(description = "&#128679; Deprecated since v4.12.0  Determines if the media server is enabled")
  public Boolean isMediaServerEnabled() {
    return mediaServerEnabled;
  }

  public void setMediaServerEnabled(Boolean mediaServerEnabled) {
    this.mediaServerEnabled = mediaServerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralSettingsInfo generalSettingsInfo = (GeneralSettingsInfo) o;
    return Objects.equals(this.sharePasswordSmsEnabled, generalSettingsInfo.sharePasswordSmsEnabled) &&
        Objects.equals(this.cryptoEnabled, generalSettingsInfo.cryptoEnabled) &&
        Objects.equals(this.emailNotificationButtonEnabled, generalSettingsInfo.emailNotificationButtonEnabled) &&
        Objects.equals(this.eulaEnabled, generalSettingsInfo.eulaEnabled) &&
        Objects.equals(this.weakPasswordEnabled, generalSettingsInfo.weakPasswordEnabled) &&
        Objects.equals(this.useS3Storage, generalSettingsInfo.useS3Storage) &&
        Objects.equals(this.s3TagsEnabled, generalSettingsInfo.s3TagsEnabled) &&
        Objects.equals(this.homeRoomsActive, generalSettingsInfo.homeRoomsActive) &&
        Objects.equals(this.homeRoomParentId, generalSettingsInfo.homeRoomParentId) &&
        Objects.equals(this.mediaServerEnabled, generalSettingsInfo.mediaServerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharePasswordSmsEnabled, cryptoEnabled, emailNotificationButtonEnabled, eulaEnabled, weakPasswordEnabled, useS3Storage, s3TagsEnabled, homeRoomsActive, homeRoomParentId, mediaServerEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralSettingsInfo {\n");
    
    sb.append("    sharePasswordSmsEnabled: ").append(toIndentedString(sharePasswordSmsEnabled)).append("\n");
    sb.append("    cryptoEnabled: ").append(toIndentedString(cryptoEnabled)).append("\n");
    sb.append("    emailNotificationButtonEnabled: ").append(toIndentedString(emailNotificationButtonEnabled)).append("\n");
    sb.append("    eulaEnabled: ").append(toIndentedString(eulaEnabled)).append("\n");
    sb.append("    weakPasswordEnabled: ").append(toIndentedString(weakPasswordEnabled)).append("\n");
    sb.append("    useS3Storage: ").append(toIndentedString(useS3Storage)).append("\n");
    sb.append("    s3TagsEnabled: ").append(toIndentedString(s3TagsEnabled)).append("\n");
    sb.append("    homeRoomsActive: ").append(toIndentedString(homeRoomsActive)).append("\n");
    sb.append("    homeRoomParentId: ").append(toIndentedString(homeRoomParentId)).append("\n");
    sb.append("    mediaServerEnabled: ").append(toIndentedString(mediaServerEnabled)).append("\n");
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
