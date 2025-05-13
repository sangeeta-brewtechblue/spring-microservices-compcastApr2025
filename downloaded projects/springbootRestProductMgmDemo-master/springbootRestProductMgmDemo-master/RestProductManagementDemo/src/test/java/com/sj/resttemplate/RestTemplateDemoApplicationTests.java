package com.sj.resttemplate;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sj.resttemplate.service.OrderService;
import com.sj.resttemplate.service.ProductService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class RestTemplateDemoApplicationTests {

	@Test
 public void contextLoads() {
	}
	
	
	   @Autowired
	   private OrderService orderService;
	   
	   @Autowired
	   private ProductService productService;

	   @Test
	   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
	      Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
	      String testName = orderService.getProductName();
	      Assert.assertEquals("Mock Product Name", testName);
	   }
	
	
	
	
	

}

