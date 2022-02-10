package com.attractor.futureStore.joinTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdAndUserRepository extends JpaRepository<ProdAndUser, Integer> {
//    List<ProdAndUser> getProdAndUsersByUserId(Integer id);
    List<ProdAndUser> getProdAndUsersByUserId(Integer id);

//    Object getProdAndUsersByUserId(Integer id);
}
