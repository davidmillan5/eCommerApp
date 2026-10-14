package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Address
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Address extends RepresentationModel<Address>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String number;

  private @Nullable String residency;

  private @Nullable String street;

  private @Nullable String city;

  private @Nullable String state;

  private @Nullable String country;

  private @Nullable String pincode;

  public Address number(@Nullable String number) {
    this.number = number;
    return this;
  }

  /**
   * house of flat number
   * @return number
   */
  
  @Schema(name = "number", description = "house of flat number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public @Nullable String getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(@Nullable String number) {
    this.number = number;
  }

  public Address residency(@Nullable String residency) {
    this.residency = residency;
    return this;
  }

  /**
   * Socieity or building name
   * @return residency
   */
  
  @Schema(name = "residency", description = "Socieity or building name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("residency")
  public @Nullable String getResidency() {
    return residency;
  }

  @JsonProperty("residency")
  public void setResidency(@Nullable String residency) {
    this.residency = residency;
  }

  public Address street(@Nullable String street) {
    this.street = street;
    return this;
  }

  /**
   * street name
   * @return street
   */
  
  @Schema(name = "street", description = "street name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public @Nullable String getStreet() {
    return street;
  }

  @JsonProperty("street")
  public void setStreet(@Nullable String street) {
    this.street = street;
  }

  public Address city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * city name
   * @return city
   */
  
  @Schema(name = "city", description = "city name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public Address state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * state name
   * @return state
   */
  
  @Schema(name = "state", description = "state name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(@Nullable String state) {
    this.state = state;
  }

  public Address country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * country name
   * @return country
   */
  
  @Schema(name = "country", description = "country name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public Address pincode(@Nullable String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * postal code
   * @return pincode
   */
  
  @Schema(name = "pincode", description = "postal code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pincode")
  public @Nullable String getPincode() {
    return pincode;
  }

  @JsonProperty("pincode")
  public void setPincode(@Nullable String pincode) {
    this.pincode = pincode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.number, address.number) &&
        Objects.equals(this.residency, address.residency) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.pincode, address.pincode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, residency, street, city, state, country, pincode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    residency: ").append(toIndentedString(residency)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

