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

import java.util.Objects;

/**
 * EnergySource
 */
@JsonPropertyOrder({
        EnergySource.JSON_PROPERTY_SOURCE,
        EnergySource.JSON_PROPERTY_PERCENTAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class EnergySource {
  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    NUCLEAR("NUCLEAR"),
    
    GENERAL_FOSSIL("GENERAL_FOSSIL"),
    
    COAL("COAL"),
    
    GAS("GAS"),
    
    GENERAL_GREEN("GENERAL_GREEN"),
    
    SOLAR("SOLAR"),
    
    WIND("WIND"),
    
    WATER("WATER");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceEnum source;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Float percentage;

  public EnergySource() {
  }

  public EnergySource source(SourceEnum source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceEnum getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  public EnergySource percentage(Float percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergySource energySource = (EnergySource) o;
    return Objects.equals(this.source, energySource.source) &&
        Objects.equals(this.percentage, energySource.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergySource {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

