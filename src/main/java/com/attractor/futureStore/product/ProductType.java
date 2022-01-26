package com.attractor.futureStore.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_types")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String type;
}
