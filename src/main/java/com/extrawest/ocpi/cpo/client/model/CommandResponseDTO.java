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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CommandResponseDTO
 */
@JsonPropertyOrder({
        CommandResponseDTO.JSON_PROPERTY_RESULT,
        CommandResponseDTO.JSON_PROPERTY_TIMEOUT,
        CommandResponseDTO.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class CommandResponseDTO {
  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    NOT_SUPPORTED("NOT_SUPPORTED"),
    
    REJECTED("REJECTED"),
    
    ACCEPTED("ACCEPTED"),
    
    UNKNOWN_SESSION("UNKNOWN_SESSION");

    private String value;

    ResultEnum(String value) {
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
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT = "result";
  private ResultEnum result;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Integer timeout;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private List<DisplayText> message;

  public CommandResponseDTO() {
  }

  public CommandResponseDTO result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResultEnum getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public CommandResponseDTO timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTimeout() {
    return timeout;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public CommandResponseDTO message(List<DisplayText> message) {
    
    this.message = message;
    return this;
  }

  public CommandResponseDTO addMessageItem(DisplayText messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<>();
    }
    this.message.add(messageItem);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DisplayText> getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(List<DisplayText> message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandResponseDTO commandResponseDTO = (CommandResponseDTO) o;
    return Objects.equals(this.result, commandResponseDTO.result) &&
        Objects.equals(this.timeout, commandResponseDTO.timeout) &&
        Objects.equals(this.message, commandResponseDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, timeout, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandResponseDTO {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

