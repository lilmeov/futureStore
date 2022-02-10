package com.attractor.futureStore.joinTable;

import com.attractor.futureStore.product.Product;
import com.attractor.futureStore.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_user")
@AllArgsConstructor
@NoArgsConstructor
public class ProdAndUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "product_id")
    Integer productId;
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    Product product;

    @Column(name = "user_id")
    Integer userId;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    User user;


    public ProdAndUser(Integer productId, Integer userId) {
        this.productId = productId;
        this.userId = userId;
    }
}

