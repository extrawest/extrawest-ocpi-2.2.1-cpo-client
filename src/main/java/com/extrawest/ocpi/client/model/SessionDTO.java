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


package com.extrawest.ocpi.client.model;

import com.fasterxml.jackson.annotation.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SessionDTO
 */
@JsonPropertyOrder({
  SessionDTO.JSON_PROPERTY_COUNTRY_CODE,
  SessionDTO.JSON_PROPERTY_PARTY_ID,
  SessionDTO.JSON_PROPERTY_ID,
  SessionDTO.JSON_PROPERTY_START_DATE_TIME,
  SessionDTO.JSON_PROPERTY_END_DATE_TIME,
  SessionDTO.JSON_PROPERTY_KWH,
  SessionDTO.JSON_PROPERTY_CDR_TOKEN,
  SessionDTO.JSON_PROPERTY_AUTH_METHOD,
  SessionDTO.JSON_PROPERTY_AUTHORIZATION_REFERENCE,
  SessionDTO.JSON_PROPERTY_LOCATION_ID,
  SessionDTO.JSON_PROPERTY_EVSE_UID,
  SessionDTO.JSON_PROPERTY_CONNECTOR_ID,
  SessionDTO.JSON_PROPERTY_METER_ID,
  SessionDTO.JSON_PROPERTY_CURRENCY,
  SessionDTO.JSON_PROPERTY_CHARGING_PERIODS,
  SessionDTO.JSON_PROPERTY_TOTAL_COST,
  SessionDTO.JSON_PROPERTY_STATUS,
  SessionDTO.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class SessionDTO {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_START_DATE_TIME = "start_date_time";
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_END_DATE_TIME = "end_date_time";
  private OffsetDateTime endDateTime;

  public static final String JSON_PROPERTY_KWH = "kwh";
  private Float kwh;

  public static final String JSON_PROPERTY_CDR_TOKEN = "cdr_token";
  private CdrToken cdrToken;

  /**
   * Gets or Sets authMethod
   */
  public enum AuthMethodEnum {
    AUTH_REQUEST("AUTH_REQUEST"),
    
    COMMAND("COMMAND"),
    
    WHITELIST("WHITELIST");

    private String value;

    AuthMethodEnum(String value) {
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
    public static AuthMethodEnum fromValue(String value) {
      for (AuthMethodEnum b : AuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTH_METHOD = "auth_method";
  private AuthMethodEnum authMethod;

  public static final String JSON_PROPERTY_AUTHORIZATION_REFERENCE = "authorization_reference";
  private String authorizationReference;

  public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
  private String locationId;

  public static final String JSON_PROPERTY_EVSE_UID = "evse_uid";
  private String evseUid;

  public static final String JSON_PROPERTY_CONNECTOR_ID = "connector_id";
  private String connectorId;

  public static final String JSON_PROPERTY_METER_ID = "meter_id";
  private String meterId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CHARGING_PERIODS = "charging_periods";
  private List<ChargingPeriod> chargingPeriods;

  public static final String JSON_PROPERTY_TOTAL_COST = "total_cost";
  private Price totalCost;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    COMPLETED("COMPLETED"),
    
    INVALID("INVALID"),
    
    PENDING("PENDING"),
    
    RESERVATION("RESERVATION");

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

  public SessionDTO() {
  }

  public SessionDTO countryCode(String countryCode) {
    
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


  public SessionDTO partyId(String partyId) {
    
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


  public SessionDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public SessionDTO startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public SessionDTO endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public SessionDTO kwh(Float kwh) {
    
    this.kwh = kwh;
    return this;
  }

   /**
   * Get kwh
   * @return kwh
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KWH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getKwh() {
    return kwh;
  }


  @JsonProperty(JSON_PROPERTY_KWH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKwh(Float kwh) {
    this.kwh = kwh;
  }


  public SessionDTO cdrToken(CdrToken cdrToken) {
    
    this.cdrToken = cdrToken;
    return this;
  }

   /**
   * Get cdrToken
   * @return cdrToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CDR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CdrToken getCdrToken() {
    return cdrToken;
  }


  @JsonProperty(JSON_PROPERTY_CDR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCdrToken(CdrToken cdrToken) {
    this.cdrToken = cdrToken;
  }


  public SessionDTO authMethod(AuthMethodEnum authMethod) {
    
    this.authMethod = authMethod;
    return this;
  }

   /**
   * Get authMethod
   * @return authMethod
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthMethodEnum getAuthMethod() {
    return authMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
  }


  public SessionDTO authorizationReference(String authorizationReference) {
    
    this.authorizationReference = authorizationReference;
    return this;
  }

   /**
   * Get authorizationReference
   * @return authorizationReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationReference() {
    return authorizationReference;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationReference(String authorizationReference) {
    this.authorizationReference = authorizationReference;
  }


  public SessionDTO locationId(String locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public SessionDTO evseUid(String evseUid) {
    
    this.evseUid = evseUid;
    return this;
  }

   /**
   * Get evseUid
   * @return evseUid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVSE_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEvseUid() {
    return evseUid;
  }


  @JsonProperty(JSON_PROPERTY_EVSE_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvseUid(String evseUid) {
    this.evseUid = evseUid;
  }


  public SessionDTO connectorId(String connectorId) {
    
    this.connectorId = connectorId;
    return this;
  }

   /**
   * Get connectorId
   * @return connectorId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorId() {
    return connectorId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorId(String connectorId) {
    this.connectorId = connectorId;
  }


  public SessionDTO meterId(String meterId) {
    
    this.meterId = meterId;
    return this;
  }

   /**
   * Get meterId
   * @return meterId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMeterId() {
    return meterId;
  }


  @JsonProperty(JSON_PROPERTY_METER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeterId(String meterId) {
    this.meterId = meterId;
  }


  public SessionDTO currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SessionDTO chargingPeriods(List<ChargingPeriod> chargingPeriods) {
    
    this.chargingPeriods = chargingPeriods;
    return this;
  }

  public SessionDTO addChargingPeriodsItem(ChargingPeriod chargingPeriodsItem) {
    if (this.chargingPeriods == null) {
      this.chargingPeriods = new ArrayList<>();
    }
    this.chargingPeriods.add(chargingPeriodsItem);
    return this;
  }

   /**
   * Get chargingPeriods
   * @return chargingPeriods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGING_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargingPeriod> getChargingPeriods() {
    return chargingPeriods;
  }


  @JsonProperty(JSON_PROPERTY_CHARGING_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargingPeriods(List<ChargingPeriod> chargingPeriods) {
    this.chargingPeriods = chargingPeriods;
  }


  public SessionDTO totalCost(Price totalCost) {
    
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Get totalCost
   * @return totalCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalCost() {
    return totalCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCost(Price totalCost) {
    this.totalCost = totalCost;
  }


  public SessionDTO status(StatusEnum status) {
    
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


  public SessionDTO lastUpdated(OffsetDateTime lastUpdated) {
    
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
    SessionDTO sessionDTO = (SessionDTO) o;
    return Objects.equals(this.countryCode, sessionDTO.countryCode) &&
        Objects.equals(this.partyId, sessionDTO.partyId) &&
        Objects.equals(this.id, sessionDTO.id) &&
        Objects.equals(this.startDateTime, sessionDTO.startDateTime) &&
        Objects.equals(this.endDateTime, sessionDTO.endDateTime) &&
        Objects.equals(this.kwh, sessionDTO.kwh) &&
        Objects.equals(this.cdrToken, sessionDTO.cdrToken) &&
        Objects.equals(this.authMethod, sessionDTO.authMethod) &&
        Objects.equals(this.authorizationReference, sessionDTO.authorizationReference) &&
        Objects.equals(this.locationId, sessionDTO.locationId) &&
        Objects.equals(this.evseUid, sessionDTO.evseUid) &&
        Objects.equals(this.connectorId, sessionDTO.connectorId) &&
        Objects.equals(this.meterId, sessionDTO.meterId) &&
        Objects.equals(this.currency, sessionDTO.currency) &&
        Objects.equals(this.chargingPeriods, sessionDTO.chargingPeriods) &&
        Objects.equals(this.totalCost, sessionDTO.totalCost) &&
        Objects.equals(this.status, sessionDTO.status) &&
        Objects.equals(this.lastUpdated, sessionDTO.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, partyId, id, startDateTime, endDateTime, kwh, cdrToken, authMethod, authorizationReference, locationId, evseUid, connectorId, meterId, currency, chargingPeriods, totalCost, status, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDTO {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    kwh: ").append(toIndentedString(kwh)).append("\n");
    sb.append("    cdrToken: ").append(toIndentedString(cdrToken)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    authorizationReference: ").append(toIndentedString(authorizationReference)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    evseUid: ").append(toIndentedString(evseUid)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    chargingPeriods: ").append(toIndentedString(chargingPeriods)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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

