package dev.trabs.movies.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // Allow requests from your React app
                        .allowedOrigins("http://localhost:3000", "https://9c96-103-106-239-104.ap.ngrok.io")
                        // Allow these HTTP methods
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        // Allow all headers
                        .allowedHeaders("*")
                        // Allow credentials (optional)
                        .allowCredentials(true);
            }
        };
    }
}
