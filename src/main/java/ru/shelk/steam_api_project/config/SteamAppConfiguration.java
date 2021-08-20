package ru.shelk.steam_api_project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.yml")
public class SteamAppConfiguration {

    @Value("${api_key}")
    private String apiKey;

    @Bean
    public String getApiKey() {
        return apiKey;
    }

}
