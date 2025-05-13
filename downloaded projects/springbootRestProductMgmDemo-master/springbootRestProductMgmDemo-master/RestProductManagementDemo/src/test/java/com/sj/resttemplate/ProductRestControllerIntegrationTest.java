package com.sj.resttemplate;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import com.sj.resttemplate.model.Product;
import com.sj.resttemplate.repository.ProductRepository;

//@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
@TestPropertySource(
  locations = "classpath:application-integrationtest.properties")
public class ProductRestControllerIntegrationTest {
	
	@Autowired
	 private MockMvc mvc;
	
	@Autowired
	ProductRepository repository;
	

	
	
	
	@Test
	public void givenProducts_whenGetProducts_thenStatus200()
	  throws Exception {

	    createTestProduct("laptop");

	    mvc.perform(get("/api/version1/products")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(content()
	      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
	      .andExpect(jsonPath("$[0].PName", is("laptop")));
	}





	private void createTestProduct(String string) {
		// TODO Auto-generated method stub
		new Product().setPName(string);
	}
	
	
	
}


