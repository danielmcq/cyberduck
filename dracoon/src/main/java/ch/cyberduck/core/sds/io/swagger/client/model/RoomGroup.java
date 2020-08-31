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
 * Group information
 */
@Schema(description = "Group information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-31T11:26:27.086143+02:00[Europe/Zurich]")
public class RoomGroup {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isGranted")
  private Boolean isGranted = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Behaviour when new users are added to the group:  * &#x60;autoallow&#x60;  * &#x60;pending&#x60;    Only relevant if &#x60;adminGroupIds&#x60; has items.
   */
  public enum NewGroupMemberAcceptanceEnum {
    AUTOALLOW("autoallow"),
    PENDING("pending");

    private String value;

    NewGroupMemberAcceptanceEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static NewGroupMemberAcceptanceEnum fromValue(String text) {
      for (NewGroupMemberAcceptanceEnum b : NewGroupMemberAcceptanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("newGroupMemberAcceptance")
  private NewGroupMemberAcceptanceEnum newGroupMemberAcceptance = NewGroupMemberAcceptanceEnum.AUTOALLOW;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  public RoomGroup id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the group
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier for the group")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomGroup isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }

   /**
   * Is user granted room permissions
   * @return isGranted
  **/
  @Schema(required = true, description = "Is user granted room permissions")
  public Boolean isIsGranted() {
    return isGranted;
  }

  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }

  public RoomGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @Schema(required = true, description = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoomGroup newGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
    return this;
  }

   /**
   * Behaviour when new users are added to the group:  * &#x60;autoallow&#x60;  * &#x60;pending&#x60;    Only relevant if &#x60;adminGroupIds&#x60; has items.
   * @return newGroupMemberAcceptance
  **/
  @Schema(description = "Behaviour when new users are added to the group:  * `autoallow`  * `pending`    Only relevant if `adminGroupIds` has items.")
  public NewGroupMemberAcceptanceEnum getNewGroupMemberAcceptance() {
    return newGroupMemberAcceptance;
  }

  public void setNewGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
  }

  public RoomGroup permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
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
    RoomGroup roomGroup = (RoomGroup) o;
    return Objects.equals(this.id, roomGroup.id) &&
        Objects.equals(this.isGranted, roomGroup.isGranted) &&
        Objects.equals(this.name, roomGroup.name) &&
        Objects.equals(this.newGroupMemberAcceptance, roomGroup.newGroupMemberAcceptance) &&
        Objects.equals(this.permissions, roomGroup.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGranted, name, newGroupMemberAcceptance, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newGroupMemberAcceptance: ").append(toIndentedString(newGroupMemberAcceptance)).append("\n");
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
