package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.grid.eCommerce.model.Address;
import com.grid.eCommerce.model.Card;
import com.grid.eCommerce.model.CustomerInfoOnCard;
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
 * Contains the payment request information
 */

@Schema(name = "PaymentReq", description = "Contains the payment request information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class PaymentReq extends RepresentationModel<PaymentReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String orderId;

  private @Nullable CustomerInfoOnCard customer;

  private @Nullable Address address;

  private @Nullable Card card;

  private @Nullable Double amount;

  public PaymentReq orderId(@Nullable String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identifier
   * @return orderId
   */
  
  @Schema(name = "orderId", description = "Order Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public @Nullable String getOrderId() {
    return orderId;
  }

  @JsonProperty("orderId")
  public void setOrderId(@Nullable String orderId) {
    this.orderId = orderId;
  }

  public PaymentReq customer(@Nullable CustomerInfoOnCard customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  @Valid 
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public @Nullable CustomerInfoOnCard getCustomer() {
    return customer;
  }

  @JsonProperty("customer")
  public void setCustomer(@Nullable CustomerInfoOnCard customer) {
    this.customer = customer;
  }

  public PaymentReq address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public PaymentReq card(@Nullable Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @Valid 
  @Schema(name = "card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card")
  public @Nullable Card getCard() {
    return card;
  }

  @JsonProperty("card")
  public void setCard(@Nullable Card card) {
    this.card = card;
  }

  public PaymentReq amount(@Nullable Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Payment amount
   * @return amount
   */
  
  @Schema(name = "amount", description = "Payment amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public @Nullable Double getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(@Nullable Double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReq paymentReq = (PaymentReq) o;
    return Objects.equals(this.orderId, paymentReq.orderId) &&
        Objects.equals(this.customer, paymentReq.customer) &&
        Objects.equals(this.address, paymentReq.address) &&
        Objects.equals(this.card, paymentReq.card) &&
        Objects.equals(this.amount, paymentReq.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customer, address, card, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReq {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

