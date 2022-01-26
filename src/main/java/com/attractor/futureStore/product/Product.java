package com.attractor.futureStore.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(length = 100)
  private String name;
  @Column(length = 123)
  private String image;
  private int amount;
  @Column(length = 128)
  private String description;
  private float price;
  @ManyToOne
  private ProductType productType;


}
