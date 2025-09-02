package com.example.demov2;

import com.example.demov2.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demov2Application implements CommandLineRunner {

	@Autowired
	private Seller seller;

	public static void main(String[] args) {
		SpringApplication.run(Demov2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		seller.showInfo();
	}
}
