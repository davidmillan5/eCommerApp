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
 * Payment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Payment extends RepresentationModel<Payment>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable Boolean authorized;

  private @Nullable String message;

  public Payment authorized(@Nullable Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Flag that specified whether payment is authorized or not
   * @return authorized
   */
  
  @Schema(name = "authorized", description = "Flag that specified whether payment is authorized or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorized")
  public @Nullable Boolean getAuthorized() {
    return authorized;
  }

  @JsonProperty("authorized")
  public void setAuthorized(@Nullable Boolean authorized) {
    this.authorized = authorized;
  }

  public Payment message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Approval or rejection message
   * @return message
   */
  
  @Schema(name = "message", description = "Approval or rejection message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
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
    Payment payment = (Payment) o;
    return Objects.equals(this.authorized, payment.authorized) &&
        Objects.equals(this.message, payment.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

