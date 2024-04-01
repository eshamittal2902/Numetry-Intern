package com.springannot.springannot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.springannot.springannot.service.CategoryService;
import com.springannot.springannot.service.ProductService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringannotApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringannotApplication.class, args);
		ProductService productService= container.getBean(ProductService.class);
		System.out.println(productService);
		productService.createProduct();
		CategoryService bean= container.getBean(CategoryService.class);
		System.out.println(bean);
		bean.getProductService().createProduct();
	}

}
