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
 * Contains the new order request information
 */

@Schema(name = "NewOrder", description = "Contains the new order request information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class NewOrder extends RepresentationModel<NewOrder>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable Object customer;

  private @Nullable Object address;

  private @Nullable Object card;

  private @Nullable Object items;

  public NewOrder customer(@Nullable Object customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public @Nullable Object getCustomer() {
    return customer;
  }

  @JsonProperty("customer")
  public void setCustomer(@Nullable Object customer) {
    this.customer = customer;
  }

  public NewOrder address(@Nullable Object address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Object getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(@Nullable Object address) {
    this.address = address;
  }

  public NewOrder card(@Nullable Object card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  
  @Schema(name = "card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card")
  public @Nullable Object getCard() {
    return card;
  }

  @JsonProperty("card")
  public void setCard(@Nullable Object card) {
    this.card = card;
  }

  public NewOrder items(@Nullable Object items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
   */
  
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public @Nullable Object getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(@Nullable Object items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOrder newOrder = (NewOrder) o;
    return Objects.equals(this.customer, newOrder.customer) &&
        Objects.equals(this.address, newOrder.address) &&
        Objects.equals(this.card, newOrder.card) &&
        Objects.equals(this.items, newOrder.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, address, card, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrder {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

