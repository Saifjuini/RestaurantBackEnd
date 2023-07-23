package project.restaurant.RestaurantBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestaurantBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantBackEndApplication.class, args);
	}

}

