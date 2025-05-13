package com.sj.resttemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;

import com.sj.resttemplate.model.Product;
import com.sj.resttemplate.repository.ProductRepository;
import com.sj.resttemplate.service.ProductService;
import com.sj.resttemplate.service.ProductServiceImpl;

@TestPropertySource(
		  locations = "classpath:application-integrationtest.properties")
@SpringBootTest()
class ProductServiceIntegrationTest {
	Product laptop;
	
	/*
	 * @TestConfiguration static class ProductServiceImplTestContextConfiguration {
	 * 
	 * @Bean public ProductService productService() { return new
	 * ProductServiceImpl(); } }
	 */

	    @Autowired
	    private ProductService productService;

	    @MockBean
	    private ProductRepository productRepository;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		 laptop = new Product(1,"laptop",50000);

	    Mockito.when(productRepository.findById(laptop.getId()))
	      .thenReturn(laptop);
		
		
	}

	@Test
	void testGetProduct() {
		    int id= 1;
		    Product found = productService.getProduct(id);
		 
		     assertEquals(found.getPName(),laptop.getPName());
	}

}
