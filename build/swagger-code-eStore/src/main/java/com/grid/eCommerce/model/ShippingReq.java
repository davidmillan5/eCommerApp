package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.grid.eCommerce.model.Address;
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
 * Contains information required for Shipping request
 */

@Schema(name = "ShippingReq", description = "Contains information required for Shipping request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class ShippingReq extends RepresentationModel<ShippingReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String orderId;

  private @Nullable Address address;

  private @Nullable Integer itemCount;

  public ShippingReq orderId(@Nullable String orderId) {
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

  public ShippingReq address(@Nullable Address address) {
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

  public ShippingReq itemCount(@Nullable Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * The number of items in the order
   * @return itemCount
   */
  
  @Schema(name = "itemCount", description = "The number of items in the order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public @Nullable Integer getItemCount() {
    return itemCount;
  }

  @JsonProperty("itemCount")
  public void setItemCount(@Nullable Integer itemCount) {
    this.itemCount = itemCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingReq shippingReq = (ShippingReq) o;
    return Objects.equals(this.orderId, shippingReq.orderId) &&
        Objects.equals(this.address, shippingReq.address) &&
        Objects.equals(this.itemCount, shippingReq.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, address, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingReq {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

