package com.attractor.futureStore.joinTable;

import com.attractor.futureStore.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdAndUserService {
    private final ProdAndUserRepository prodAndUserRepository;

    public List<ProdAndUser> getAllProdAndUser() {
        return prodAndUserRepository.findAll();
    }

    public ProdAndUser getBothWithUserId(Integer id){
        return (ProdAndUser) prodAndUserRepository.getProdAndUsersByUserId(id);
    }

    public ProdAndUser saveProdAndUser(ProdAndUser prodAndUser){
        return prodAndUserRepository.save(prodAndUser);
    }
}
