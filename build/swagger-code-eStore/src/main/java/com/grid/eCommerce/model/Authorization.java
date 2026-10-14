package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
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
 * Authorization
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Authorization extends RepresentationModel<Authorization>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String orderId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date time;

  private @Nullable Boolean authorized;

  private @Nullable String message;

  private @Nullable String error;

  public Authorization orderId(@Nullable String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identification
   * @return orderId
   */
  
  @Schema(name = "orderId", description = "Order Identification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public @Nullable String getOrderId() {
    return orderId;
  }

  @JsonProperty("orderId")
  public void setOrderId(@Nullable String orderId) {
    this.orderId = orderId;
  }

  public Authorization time(@Nullable Date time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp when this authorization was created
   * @return time
   */
  @Valid 
  @Schema(name = "time", description = "Timestamp when this authorization was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public @Nullable Date getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(@Nullable Date time) {
    this.time = time;
  }

  public Authorization authorized(@Nullable Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Flat that specify whether the payment is authorized
   * @return authorized
   */
  
  @Schema(name = "authorized", description = "Flat that specify whether the payment is authorized", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorized")
  public @Nullable Boolean getAuthorized() {
    return authorized;
  }

  @JsonProperty("authorized")
  public void setAuthorized(@Nullable Boolean authorized) {
    this.authorized = authorized;
  }

  public Authorization message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Approavl or rejection message
   * @return message
   */
  
  @Schema(name = "message", description = "Approavl or rejection message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public Authorization error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Processing error description, if any
   * @return error
   */
  
  @Schema(name = "error", description = "Processing error description, if any", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(@Nullable String error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.orderId, authorization.orderId) &&
        Objects.equals(this.time, authorization.time) &&
        Objects.equals(this.authorized, authorization.authorized) &&
        Objects.equals(this.message, authorization.message) &&
        Objects.equals(this.error, authorization.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, time, authorized, message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

