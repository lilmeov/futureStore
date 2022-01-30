package com.attractor.futureStore.product;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(length = 100)
  @NotBlank(message = "Name must be written")
  private String name;
  @Column(length = 200)
  @NotBlank(message = "Provide image (link in this case) of your product")
  private String image;
  @PositiveOrZero
  private int amount;
  @Column(length = 250)
  @NotBlank(message = "description must be written")
  @Size(min = 10, max = 250, message = "description is too long or empty")
  private String description;
  @PositiveOrZero
  private float price;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private ProductType productType;

  public Product(@NotBlank String name, String image, int amount, @NotBlank String description, @PositiveOrZero float price, ProductType productType) {
    this.name = name;
    this.image = image;
    this.amount = amount;
    this.description = description;
    this.price = price;
    this.productType = productType;
  }
}
