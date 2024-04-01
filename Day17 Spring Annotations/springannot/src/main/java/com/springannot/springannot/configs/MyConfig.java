package com.springannot.springannot.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springannot.springannot.service.ProductService;

@Configuration
public class MyConfig {

	@Bean
	public ProductService productService() {
		return new ProductService();
	}
}
