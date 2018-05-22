/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class FileKey {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("iv")
  private String iv = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("tag")
  private String tag = null;

  public FileKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Encryption key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Encryption key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FileKey iv(String iv) {
    this.iv = iv;
    return this;
  }

   /**
   * Initial vector
   * @return iv
  **/
  @ApiModelProperty(required = true, value = "Initial vector")
  public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }

  public FileKey version(String version) {
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public FileKey tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Authentication tag
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "Authentication tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileKey fileKey = (FileKey) o;
    return Objects.equals(this.key, fileKey.key) &&
        Objects.equals(this.iv, fileKey.iv) &&
        Objects.equals(this.version, fileKey.version) &&
        Objects.equals(this.tag, fileKey.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, iv, version, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileKey {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
