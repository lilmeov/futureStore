package com.attractor.futureStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FutureStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureStoreApplication.class, args);
	}

}
