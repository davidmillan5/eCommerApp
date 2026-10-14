package com.grid.eCommerce.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * Product information
 */

@Schema(name = "Product", description = "Product information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.26.0")
public class Product extends RepresentationModel<Product>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String imageUrl;

  private @Nullable Double price;

  private @Nullable Integer count;

  private Set<String> tag = new LinkedHashSet<>();

  public Product id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Product identifier
   * @return id
   */
  
  @Schema(name = "id", description = "Product identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Product name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Product Name
   * @return name
   */
  
  @Schema(name = "name", description = "Product Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Product description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Prodcut's description
   * @return description
   */
  
  @Schema(name = "description", description = "Prodcut's description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Product imageUrl(@Nullable String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Product image's URL
   * @return imageUrl
   */
  
  @Schema(name = "imageUrl", description = "Product image's URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public @Nullable String getImageUrl() {
    return imageUrl;
  }

  @JsonProperty("imageUrl")
  public void setImageUrl(@Nullable String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Product price(@Nullable Double price) {
    this.price = price;
    return this;
  }

  /**
   * Product price
   * @return price
   */
  
  @Schema(name = "price", description = "Product price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Double getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(@Nullable Double price) {
    this.price = price;
  }

  public Product count(@Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Product count
   * @return count
   */
  
  @Schema(name = "count", description = "Product count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Integer getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(@Nullable Integer count) {
    this.count = count;
  }

  public Product tag(Set<String> tag) {
    this.tag = tag;
    return this;
  }

  public Product addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new LinkedHashSet<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * Tags associated with the product
   * @return tag
   */
  
  @Schema(name = "tag", description = "Tags associated with the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public Set<String> getTag() {
    return tag;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty("tag")
  public void setTag(Set<String> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.count, product.count) &&
        Objects.equals(this.tag, product.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, price, count, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

