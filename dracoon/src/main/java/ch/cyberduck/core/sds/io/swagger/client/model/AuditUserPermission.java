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
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Audit user permissions report
 */
@Schema(description = "Audit user permissions report")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-31T11:26:27.086143+02:00[Europe/Zurich]")
public class AuditUserPermission {
  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("userLogin")
  private String userLogin = null;

  @JsonProperty("userFirstName")
  private String userFirstName = null;

  @JsonProperty("userLastName")
  private String userLastName = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  public AuditUserPermission userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique identifier for the user
   * @return userId
  **/
  @Schema(required = true, description = "Unique identifier for the user")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AuditUserPermission userLogin(String userLogin) {
    this.userLogin = userLogin;
    return this;
  }

   /**
   * User login name
   * @return userLogin
  **/
  @Schema(required = true, description = "User login name")
  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public AuditUserPermission userFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
    return this;
  }

   /**
   * User first name
   * @return userFirstName
  **/
  @Schema(required = true, description = "User first name")
  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public AuditUserPermission userLastName(String userLastName) {
    this.userLastName = userLastName;
    return this;
  }

   /**
   * User last name
   * @return userLastName
  **/
  @Schema(required = true, description = "User last name")
  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public AuditUserPermission permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(required = true, description = "")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditUserPermission auditUserPermission = (AuditUserPermission) o;
    return Objects.equals(this.userId, auditUserPermission.userId) &&
        Objects.equals(this.userLogin, auditUserPermission.userLogin) &&
        Objects.equals(this.userFirstName, auditUserPermission.userFirstName) &&
        Objects.equals(this.userLastName, auditUserPermission.userLastName) &&
        Objects.equals(this.permissions, auditUserPermission.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userLogin, userFirstName, userLastName, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditUserPermission {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userLogin: ").append(toIndentedString(userLogin)).append("\n");
    sb.append("    userFirstName: ").append(toIndentedString(userFirstName)).append("\n");
    sb.append("    userLastName: ").append(toIndentedString(userLastName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
