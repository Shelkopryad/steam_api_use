package ru.shelk.steam_api_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SteamApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteamApiProjectApplication.class, args);
	}

}
