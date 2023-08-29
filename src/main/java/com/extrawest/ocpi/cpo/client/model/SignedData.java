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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SignedData
 */
@JsonPropertyOrder({
        SignedData.JSON_PROPERTY_ENCODING_METHOD,
        SignedData.JSON_PROPERTY_ENCODING_METHOD_VERSION,
        SignedData.JSON_PROPERTY_PUBLIC_KEY,
        SignedData.JSON_PROPERTY_SIGNED_VALUES,
        SignedData.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T16:33:36.372088+03:00[Europe/Kiev]")
public class SignedData {
  public static final String JSON_PROPERTY_ENCODING_METHOD = "encoding_method";
  private String encodingMethod;

  public static final String JSON_PROPERTY_ENCODING_METHOD_VERSION = "encoding_method_version";
  private Integer encodingMethodVersion;

  public static final String JSON_PROPERTY_PUBLIC_KEY = "public_key";
  private String publicKey;

  public static final String JSON_PROPERTY_SIGNED_VALUES = "signed_values";
  private List<SignedValue> signedValues;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SignedData() {
  }

  public SignedData encodingMethod(String encodingMethod) {
    
    this.encodingMethod = encodingMethod;
    return this;
  }

   /**
   * Get encodingMethod
   * @return encodingMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodingMethod() {
    return encodingMethod;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncodingMethod(String encodingMethod) {
    this.encodingMethod = encodingMethod;
  }


  public SignedData encodingMethodVersion(Integer encodingMethodVersion) {
    
    this.encodingMethodVersion = encodingMethodVersion;
    return this;
  }

   /**
   * Get encodingMethodVersion
   * @return encodingMethodVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING_METHOD_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEncodingMethodVersion() {
    return encodingMethodVersion;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING_METHOD_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncodingMethodVersion(Integer encodingMethodVersion) {
    this.encodingMethodVersion = encodingMethodVersion;
  }


  public SignedData publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicKey() {
    return publicKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public SignedData signedValues(List<SignedValue> signedValues) {
    
    this.signedValues = signedValues;
    return this;
  }

  public SignedData addSignedValuesItem(SignedValue signedValuesItem) {
    if (this.signedValues == null) {
      this.signedValues = new ArrayList<>();
    }
    this.signedValues.add(signedValuesItem);
    return this;
  }

   /**
   * Get signedValues
   * @return signedValues
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SignedValue> getSignedValues() {
    return signedValues;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedValues(List<SignedValue> signedValues) {
    this.signedValues = signedValues;
  }


  public SignedData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedData signedData = (SignedData) o;
    return Objects.equals(this.encodingMethod, signedData.encodingMethod) &&
        Objects.equals(this.encodingMethodVersion, signedData.encodingMethodVersion) &&
        Objects.equals(this.publicKey, signedData.publicKey) &&
        Objects.equals(this.signedValues, signedData.signedValues) &&
        Objects.equals(this.url, signedData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingMethod, encodingMethodVersion, publicKey, signedValues, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedData {\n");
    sb.append("    encodingMethod: ").append(toIndentedString(encodingMethod)).append("\n");
    sb.append("    encodingMethodVersion: ").append(toIndentedString(encodingMethodVersion)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    signedValues: ").append(toIndentedString(signedValues)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

