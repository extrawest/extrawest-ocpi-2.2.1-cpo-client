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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VersionDetailsResponseDTO
 */
@JsonPropertyOrder({
  VersionDetailsResponseDTO.JSON_PROPERTY_VERSION,
  VersionDetailsResponseDTO.JSON_PROPERTY_ENDPOINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class VersionDetailsResponseDTO {
  /**
   * Gets or Sets version
   */
  public enum VersionEnum {
    _0("2.0"),
    
    _1("2.1"),
    
    _1_1("2.1.1"),
    
    _2("2.2"),
    
    _2_1("2.2.1");

    private String value;

    VersionEnum(String value) {
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
    public static VersionEnum fromValue(String value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERSION = "version";
  private VersionEnum version;

  public static final String JSON_PROPERTY_ENDPOINTS = "endpoints";
  private List<Endpoint> endpoints = new ArrayList<>();

  public VersionDetailsResponseDTO() {
  }

  public VersionDetailsResponseDTO version(VersionEnum version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VersionEnum getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  public VersionDetailsResponseDTO endpoints(List<Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public VersionDetailsResponseDTO addEndpointsItem(Endpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Endpoint> getEndpoints() {
    return endpoints;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionDetailsResponseDTO versionDetailsResponseDTO = (VersionDetailsResponseDTO) o;
    return Objects.equals(this.version, versionDetailsResponseDTO.version) &&
        Objects.equals(this.endpoints, versionDetailsResponseDTO.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionDetailsResponseDTO {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

