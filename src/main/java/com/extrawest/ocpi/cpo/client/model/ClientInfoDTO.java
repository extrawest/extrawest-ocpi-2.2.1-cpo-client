/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpi.cpo.client.model;

import com.fasterxml.jackson.annotation.*;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ClientInfoDTO
 */
@JsonPropertyOrder({
        ClientInfoDTO.JSON_PROPERTY_PARTY_ID,
        ClientInfoDTO.JSON_PROPERTY_COUNTRY_CODE,
        ClientInfoDTO.JSON_PROPERTY_ROLE,
        ClientInfoDTO.JSON_PROPERTY_STATUS,
        ClientInfoDTO.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class ClientInfoDTO {
  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    CPO("CPO"),
    
    EMSP("EMSP"),
    
    HUB("HUB"),
    
    NAP("NAP"),
    
    NSP("NSP"),
    
    OTHER("OTHER"),
    
    SCSP("SCSP");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CONNECTED("CONNECTED"),
    
    OFFLINE("OFFLINE"),
    
    PLANNED("PLANNED"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public ClientInfoDTO() {
  }

  public ClientInfoDTO partyId(String partyId) {
    
    this.partyId = partyId;
    return this;
  }

   /**
   * Get partyId
   * @return partyId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPartyId() {
    return partyId;
  }


  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }


  public ClientInfoDTO countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ClientInfoDTO role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public ClientInfoDTO status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ClientInfoDTO lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfoDTO clientInfoDTO = (ClientInfoDTO) o;
    return Objects.equals(this.partyId, clientInfoDTO.partyId) &&
        Objects.equals(this.countryCode, clientInfoDTO.countryCode) &&
        Objects.equals(this.role, clientInfoDTO.role) &&
        Objects.equals(this.status, clientInfoDTO.status) &&
        Objects.equals(this.lastUpdated, clientInfoDTO.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, countryCode, role, status, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfoDTO {\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

