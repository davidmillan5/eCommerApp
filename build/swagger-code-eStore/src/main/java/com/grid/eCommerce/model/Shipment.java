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
 * Shipment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Shipment extends RepresentationModel<Shipment>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String orderId;

  private @Nullable String carrier;

  private @Nullable String trackingNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable Date estDeliveryDate;

  public Shipment orderId(@Nullable String orderId) {
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

  public Shipment carrier(@Nullable String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Shipping Carrier
   * @return carrier
   */
  
  @Schema(name = "carrier", description = "Shipping Carrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrier")
  public @Nullable String getCarrier() {
    return carrier;
  }

  @JsonProperty("carrier")
  public void setCarrier(@Nullable String carrier) {
    this.carrier = carrier;
  }

  public Shipment trackingNumber(@Nullable String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Shipping Tracking Number
   * @return trackingNumber
   */
  
  @Schema(name = "trackingNumber", description = "Shipping Tracking Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackingNumber")
  public @Nullable String getTrackingNumber() {
    return trackingNumber;
  }

  @JsonProperty("trackingNumber")
  public void setTrackingNumber(@Nullable String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Shipment estDeliveryDate(@Nullable Date estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Estimated Delivery Date
   * @return estDeliveryDate
   */
  @Valid 
  @Schema(name = "estDeliveryDate", description = "Estimated Delivery Date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estDeliveryDate")
  public @Nullable Date getEstDeliveryDate() {
    return estDeliveryDate;
  }

  @JsonProperty("estDeliveryDate")
  public void setEstDeliveryDate(@Nullable Date estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.orderId, shipment.orderId) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.estDeliveryDate, shipment.estDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, carrier, trackingNumber, estDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    estDeliveryDate: ").append(toIndentedString(estDeliveryDate)).append("\n");
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

