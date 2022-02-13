package com.attractor.futureStore;

import com.attractor.futureStore.joinTable.ProdAndUser;
import com.attractor.futureStore.joinTable.ProdAndUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
public class FutureStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(FutureStoreApplication.class, args);
	}

}
