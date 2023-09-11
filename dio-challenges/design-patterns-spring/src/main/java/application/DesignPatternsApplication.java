package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot project generated through Spring Initializr.
 * The following modules were chosen:
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
