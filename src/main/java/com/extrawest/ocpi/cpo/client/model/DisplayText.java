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

import java.util.Objects;

/**
 * DisplayText
 */
@JsonPropertyOrder({
        DisplayText.JSON_PROPERTY_LANGUAGE,
        DisplayText.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class DisplayText {
    public static final String JSON_PROPERTY_LANGUAGE = "language";
    public static final String JSON_PROPERTY_TEXT = "text";
    private String language;
    private String text;

    public DisplayText() {
    }

    public DisplayText language(String language) {

        this.language = language;
        return this;
    }

    /**
     * Get language
     *
     * @return language
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getLanguage() {
        return language;
    }


    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLanguage(String language) {
        this.language = language;
    }


    public DisplayText text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getText() {
        return text;
    }


    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisplayText displayText = (DisplayText) o;
        return Objects.equals(this.language, displayText.language) &&
                Objects.equals(this.text, displayText.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayText {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

