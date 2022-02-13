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

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public ProdAndUser(Product product, User user) {
        this.product = product;
        this.user = user;
    }

}

