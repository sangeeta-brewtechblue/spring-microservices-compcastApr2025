package com.sj.product_client.product_resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductResttemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductResttemplateApplication.class, args);
	}
	
	@Bean
	RestTemplate resttemplate() {
		return new RestTemplate();
	}
	

}
