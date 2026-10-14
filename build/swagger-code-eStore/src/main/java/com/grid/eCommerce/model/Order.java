package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.grid.eCommerce.model.Address;
import com.grid.eCommerce.model.Card;
import com.grid.eCommerce.model.Item;
import com.grid.eCommerce.model.Payment;
import com.grid.eCommerce.model.Shipment;
import com.grid.eCommerce.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
 * Represents an order
 */

@Schema(name = "Order", description = "Represents an order")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Order extends RepresentationModel<Order>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String id;

  private @Nullable User customer;

  private @Nullable Address address;

  private @Nullable Card card;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable Date date;

  private List<@Valid Item> items = new ArrayList<>();

  private @Nullable Double total;

  private @Nullable Payment payment;

  private @Nullable Shipment shipment;

  /**
   * Order Status
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    PAID("PAID"),
    
    SHIPPED("SHIPPED"),
    
    PAYMENT_FAILED("PAYMENT_FAILED"),
    
    SHIPMENT_FAILED("SHIPMENT_FAILED"),
    
    COMPLETED("COMPLETED");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  public Order id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Order identifier
   * @return id
   */
  
  @Schema(name = "id", description = "Order identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Order customer(@Nullable User customer) {
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
  public @Nullable User getCustomer() {
    return customer;
  }

  @JsonProperty("customer")
  public void setCustomer(@Nullable User customer) {
    this.customer = customer;
  }

  public Order address(@Nullable Address address) {
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

  public Order card(@Nullable Card card) {
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

  public Order date(@Nullable Date date) {
    this.date = date;
    return this;
  }

  /**
   * Order's data and time details
   * @return date
   */
  @Valid 
  @Schema(name = "date", description = "Order's data and time details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public @Nullable Date getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(@Nullable Date date) {
    this.date = date;
  }

  public Order items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Collection of order items.
   * @return items
   */
  
  @Schema(name = "items", description = "Collection of order items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  public Order total(@Nullable Double total) {
    this.total = total;
    return this;
  }

  /**
   * Order total
   * @return total
   */
  
  @Schema(name = "total", description = "Order total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable Double getTotal() {
    return total;
  }

  @JsonProperty("total")
  public void setTotal(@Nullable Double total) {
    this.total = total;
  }

  public Order payment(@Nullable Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment")
  public @Nullable Payment getPayment() {
    return payment;
  }

  @JsonProperty("payment")
  public void setPayment(@Nullable Payment payment) {
    this.payment = payment;
  }

  public Order shipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * Get shipment
   * @return shipment
   */
  @Valid 
  @Schema(name = "shipment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipment")
  public @Nullable Shipment getShipment() {
    return shipment;
  }

  @JsonProperty("shipment")
  public void setShipment(@Nullable Shipment shipment) {
    this.shipment = shipment;
  }

  public Order status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
   */
  
  @Schema(name = "status", description = "Order Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.address, order.address) &&
        Objects.equals(this.card, order.card) &&
        Objects.equals(this.date, order.date) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.total, order.total) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.shipment, order.shipment) &&
        Objects.equals(this.status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, address, card, date, items, total, payment, shipment, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

