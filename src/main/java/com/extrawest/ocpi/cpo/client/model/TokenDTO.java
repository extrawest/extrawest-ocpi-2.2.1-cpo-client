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
 * TokenDTO
 */
@JsonPropertyOrder({
        TokenDTO.JSON_PROPERTY_COUNTRY_CODE,
        TokenDTO.JSON_PROPERTY_PARTY_ID,
        TokenDTO.JSON_PROPERTY_UID,
        TokenDTO.JSON_PROPERTY_TYPE,
        TokenDTO.JSON_PROPERTY_CONTRACT_ID,
        TokenDTO.JSON_PROPERTY_VISUAL_NUMBER,
        TokenDTO.JSON_PROPERTY_ISSUER,
        TokenDTO.JSON_PROPERTY_GROUP_ID,
        TokenDTO.JSON_PROPERTY_VALID,
        TokenDTO.JSON_PROPERTY_WHITELIST,
        TokenDTO.JSON_PROPERTY_LANGUAGE,
        TokenDTO.JSON_PROPERTY_DEFAULT_PROFILE_TYPE,
        TokenDTO.JSON_PROPERTY_ENERGY_CONTRACT,
        TokenDTO.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class TokenDTO {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    AD_HOC_USER("AD_HOC_USER"),
    
    APP_USER("APP_USER"),
    
    OTHER("OTHER"),
    
    RFID("RFID");

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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CONTRACT_ID = "contract_id";
  private String contractId;

  public static final String JSON_PROPERTY_VISUAL_NUMBER = "visual_number";
  private String visualNumber;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private String groupId;

  public static final String JSON_PROPERTY_VALID = "valid";
  private Boolean valid;

  /**
   * Gets or Sets whitelist
   */
  public enum WhitelistEnum {
    ALWAYS("ALWAYS"),
    
    ALLOWED("ALLOWED"),
    
    ALLOWED_OFFLINE("ALLOWED_OFFLINE"),
    
    NEVER("NEVER");

    private String value;

    WhitelistEnum(String value) {
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
    public static WhitelistEnum fromValue(String value) {
      for (WhitelistEnum b : WhitelistEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WHITELIST = "whitelist";
  private WhitelistEnum whitelist;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * Gets or Sets defaultProfileType
   */
  public enum DefaultProfileTypeEnum {
    CHEAP("CHEAP"),
    
    FAST("FAST"),
    
    GREEN("GREEN"),
    
    REGULAR("REGULAR");

    private String value;

    DefaultProfileTypeEnum(String value) {
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
    public static DefaultProfileTypeEnum fromValue(String value) {
      for (DefaultProfileTypeEnum b : DefaultProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEFAULT_PROFILE_TYPE = "default_profile_type";
  private DefaultProfileTypeEnum defaultProfileType;

  public static final String JSON_PROPERTY_ENERGY_CONTRACT = "energy_contract";
  private EnergyContract energyContract;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public TokenDTO() {
  }

  public TokenDTO countryCode(String countryCode) {
    
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


  public TokenDTO partyId(String partyId) {
    
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


  public TokenDTO uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public TokenDTO type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TokenDTO contractId(String contractId) {
    
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContractId() {
    return contractId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public TokenDTO visualNumber(String visualNumber) {
    
    this.visualNumber = visualNumber;
    return this;
  }

   /**
   * Get visualNumber
   * @return visualNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisualNumber() {
    return visualNumber;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualNumber(String visualNumber) {
    this.visualNumber = visualNumber;
  }


  public TokenDTO issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public TokenDTO groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public TokenDTO valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getValid() {
    return valid;
  }


  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public TokenDTO whitelist(WhitelistEnum whitelist) {
    
    this.whitelist = whitelist;
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WhitelistEnum getWhitelist() {
    return whitelist;
  }


  @JsonProperty(JSON_PROPERTY_WHITELIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhitelist(WhitelistEnum whitelist) {
    this.whitelist = whitelist;
  }


  public TokenDTO language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public TokenDTO defaultProfileType(DefaultProfileTypeEnum defaultProfileType) {
    
    this.defaultProfileType = defaultProfileType;
    return this;
  }

   /**
   * Get defaultProfileType
   * @return defaultProfileType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_PROFILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultProfileTypeEnum getDefaultProfileType() {
    return defaultProfileType;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PROFILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultProfileType(DefaultProfileTypeEnum defaultProfileType) {
    this.defaultProfileType = defaultProfileType;
  }


  public TokenDTO energyContract(EnergyContract energyContract) {
    
    this.energyContract = energyContract;
    return this;
  }

   /**
   * Get energyContract
   * @return energyContract
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENERGY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnergyContract getEnergyContract() {
    return energyContract;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnergyContract(EnergyContract energyContract) {
    this.energyContract = energyContract;
  }


  public TokenDTO lastUpdated(OffsetDateTime lastUpdated) {
    
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
    TokenDTO tokenDTO = (TokenDTO) o;
    return Objects.equals(this.countryCode, tokenDTO.countryCode) &&
        Objects.equals(this.partyId, tokenDTO.partyId) &&
        Objects.equals(this.uid, tokenDTO.uid) &&
        Objects.equals(this.type, tokenDTO.type) &&
        Objects.equals(this.contractId, tokenDTO.contractId) &&
        Objects.equals(this.visualNumber, tokenDTO.visualNumber) &&
        Objects.equals(this.issuer, tokenDTO.issuer) &&
        Objects.equals(this.groupId, tokenDTO.groupId) &&
        Objects.equals(this.valid, tokenDTO.valid) &&
        Objects.equals(this.whitelist, tokenDTO.whitelist) &&
        Objects.equals(this.language, tokenDTO.language) &&
        Objects.equals(this.defaultProfileType, tokenDTO.defaultProfileType) &&
        Objects.equals(this.energyContract, tokenDTO.energyContract) &&
        Objects.equals(this.lastUpdated, tokenDTO.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, partyId, uid, type, contractId, visualNumber, issuer, groupId, valid, whitelist, language, defaultProfileType, energyContract, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDTO {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    visualNumber: ").append(toIndentedString(visualNumber)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    defaultProfileType: ").append(toIndentedString(defaultProfileType)).append("\n");
    sb.append("    energyContract: ").append(toIndentedString(energyContract)).append("\n");
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

