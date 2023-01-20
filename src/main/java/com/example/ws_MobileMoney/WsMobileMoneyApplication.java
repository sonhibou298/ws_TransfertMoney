package com.example.ws_MobileMoney;

import com.example.ws_MobileMoney.entities.Client;
import com.example.ws_MobileMoney.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsMobileMoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsMobileMoneyApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ClientRepository clientRepository){
		return args -> {
			clientRepository.save(new Client(1,"SENE", "Sonhibou",5000));
		};
	}

}
