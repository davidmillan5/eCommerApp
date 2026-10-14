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
 * AddAddressReq
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class AddAddressReq extends RepresentationModel<AddAddressReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String number;

  private @Nullable String residency;

  private @Nullable String street;

  private @Nullable String city;

  private @Nullable String state;

  private @Nullable String country;

  private @Nullable String pincode;

  private @Nullable String userId;

  public AddAddressReq number(@Nullable String number) {
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

  public AddAddressReq residency(@Nullable String residency) {
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

  public AddAddressReq street(@Nullable String street) {
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

  public AddAddressReq city(@Nullable String city) {
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

  public AddAddressReq state(@Nullable String state) {
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

  public AddAddressReq country(@Nullable String country) {
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

  public AddAddressReq pincode(@Nullable String pincode) {
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

  public AddAddressReq userId(@Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public @Nullable String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(@Nullable String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAddressReq addAddressReq = (AddAddressReq) o;
    return Objects.equals(this.number, addAddressReq.number) &&
        Objects.equals(this.residency, addAddressReq.residency) &&
        Objects.equals(this.street, addAddressReq.street) &&
        Objects.equals(this.city, addAddressReq.city) &&
        Objects.equals(this.state, addAddressReq.state) &&
        Objects.equals(this.country, addAddressReq.country) &&
        Objects.equals(this.pincode, addAddressReq.pincode) &&
        Objects.equals(this.userId, addAddressReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, residency, street, city, state, country, pincode, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAddressReq {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    residency: ").append(toIndentedString(residency)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

