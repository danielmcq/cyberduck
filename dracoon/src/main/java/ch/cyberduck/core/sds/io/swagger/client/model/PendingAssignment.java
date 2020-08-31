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
 * Pending assignment information
 */
@Schema(description = "Pending assignment information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-31T11:26:27.086143+02:00[Europe/Zurich]")
public class PendingAssignment {
  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("roomId")
  private Long roomId = null;

  /**
   * Acceptance state:  * &#x60;ACCEPTED&#x60;  * &#x60;WAITING&#x60;  * &#x60;DENIED&#x60;
   */
  public enum StateEnum {
    ACCEPTED("ACCEPTED"),
    DENIED("DENIED"),
    WAITING("WAITING");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("state")
  private StateEnum state = null;

  public PendingAssignment userId(Long userId) {
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

  public PendingAssignment groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Unique identifier for the group
   * @return groupId
  **/
  @Schema(required = true, description = "Unique identifier for the group")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public PendingAssignment roomId(Long roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Room ID
   * @return roomId
  **/
  @Schema(required = true, description = "Room ID")
  public Long getRoomId() {
    return roomId;
  }

  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }

  public PendingAssignment state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Acceptance state:  * &#x60;ACCEPTED&#x60;  * &#x60;WAITING&#x60;  * &#x60;DENIED&#x60;
   * @return state
  **/
  @Schema(required = true, description = "Acceptance state:  * `ACCEPTED`  * `WAITING`  * `DENIED`")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingAssignment pendingAssignment = (PendingAssignment) o;
    return Objects.equals(this.userId, pendingAssignment.userId) &&
        Objects.equals(this.groupId, pendingAssignment.groupId) &&
        Objects.equals(this.roomId, pendingAssignment.roomId) &&
        Objects.equals(this.state, pendingAssignment.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, groupId, roomId, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingAssignment {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
