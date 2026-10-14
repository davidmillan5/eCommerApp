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
 * Request object for new card registration.
 */

@Schema(name = "AddCardReq", description = "Request object for new card registration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class AddCardReq extends RepresentationModel<AddCardReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String cardNumber;

  private @Nullable String expires;

  private @Nullable String ccv;

  private @Nullable Object userId;

  public AddCardReq cardNumber(@Nullable String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Card Number
   * @return cardNumber
   */
  
  @Schema(name = "cardNumber", description = "Card Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardNumber")
  public @Nullable String getCardNumber() {
    return cardNumber;
  }

  @JsonProperty("cardNumber")
  public void setCardNumber(@Nullable String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public AddCardReq expires(@Nullable String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Expiration date
   * @return expires
   */
  
  @Schema(name = "expires", description = "Expiration date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public @Nullable String getExpires() {
    return expires;
  }

  @JsonProperty("expires")
  public void setExpires(@Nullable String expires) {
    this.expires = expires;
  }

  public AddCardReq ccv(@Nullable String ccv) {
    this.ccv = ccv;
    return this;
  }

  /**
   * CCV code
   * @return ccv
   */
  
  @Schema(name = "ccv", description = "CCV code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ccv")
  public @Nullable String getCcv() {
    return ccv;
  }

  @JsonProperty("ccv")
  public void setCcv(@Nullable String ccv) {
    this.ccv = ccv;
  }

  public AddCardReq userId(@Nullable Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public @Nullable Object getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(@Nullable Object userId) {
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
    AddCardReq addCardReq = (AddCardReq) o;
    return Objects.equals(this.cardNumber, addCardReq.cardNumber) &&
        Objects.equals(this.expires, addCardReq.expires) &&
        Objects.equals(this.ccv, addCardReq.ccv) &&
        Objects.equals(this.userId, addCardReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expires, ccv, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCardReq {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    ccv: ").append(toIndentedString(ccv)).append("\n");
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

