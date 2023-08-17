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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ChargingPeriod
 */
@JsonPropertyOrder({
  ChargingPeriod.JSON_PROPERTY_START_DATE_TIME,
  ChargingPeriod.JSON_PROPERTY_DIMENSIONS,
  ChargingPeriod.JSON_PROPERTY_TARIFF_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class ChargingPeriod {
  public static final String JSON_PROPERTY_START_DATE_TIME = "start_date_time";
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<CdrDimension> dimensions;

  public static final String JSON_PROPERTY_TARIFF_ID = "tariff_id";
  private String tariffId;

  public ChargingPeriod() {
  }

  public ChargingPeriod startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public ChargingPeriod dimensions(List<CdrDimension> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ChargingPeriod addDimensionsItem(CdrDimension dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CdrDimension> getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(List<CdrDimension> dimensions) {
    this.dimensions = dimensions;
  }


  public ChargingPeriod tariffId(String tariffId) {
    
    this.tariffId = tariffId;
    return this;
  }

   /**
   * Get tariffId
   * @return tariffId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARIFF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTariffId() {
    return tariffId;
  }


  @JsonProperty(JSON_PROPERTY_TARIFF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTariffId(String tariffId) {
    this.tariffId = tariffId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingPeriod chargingPeriod = (ChargingPeriod) o;
    return Objects.equals(this.startDateTime, chargingPeriod.startDateTime) &&
        Objects.equals(this.dimensions, chargingPeriod.dimensions) &&
        Objects.equals(this.tariffId, chargingPeriod.tariffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, dimensions, tariffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingPeriod {\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    tariffId: ").append(toIndentedString(tariffId)).append("\n");
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

