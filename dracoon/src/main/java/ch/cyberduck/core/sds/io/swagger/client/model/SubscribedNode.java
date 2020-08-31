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
 * Subscribed node information
 */
@Schema(description = "Subscribed node information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-31T11:26:27.086143+02:00[Europe/Zurich]")
public class SubscribedNode {
  @JsonProperty("id")
  private Long id = null;

  /**
   * Node type
   */
  public enum TypeEnum {
    ROOM("room"),
    FOLDER("folder"),
    FILE("file");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("authParentId")
  private Long authParentId = null;

  public SubscribedNode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID
   * @return id
  **/
  @Schema(required = true, description = "Node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SubscribedNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @Schema(description = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SubscribedNode authParentId(Long authParentId) {
    this.authParentId = authParentId;
    return this;
  }

   /**
   * Auth parent room ID
   * @return authParentId
  **/
  @Schema(description = "Auth parent room ID")
  public Long getAuthParentId() {
    return authParentId;
  }

  public void setAuthParentId(Long authParentId) {
    this.authParentId = authParentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribedNode subscribedNode = (SubscribedNode) o;
    return Objects.equals(this.id, subscribedNode.id) &&
        Objects.equals(this.type, subscribedNode.type) &&
        Objects.equals(this.authParentId, subscribedNode.authParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, authParentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribedNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authParentId: ").append(toIndentedString(authParentId)).append("\n");
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
