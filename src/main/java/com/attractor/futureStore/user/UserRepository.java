package com.attractor.futureStore.user;

import com.attractor.futureStore.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User getUserById (Integer name);
    User getUserByUsername(String username);
}
