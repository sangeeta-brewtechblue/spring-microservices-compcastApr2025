package com.sj.resttemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//created this for test example
@Service
public class OrderService {
   @Autowired
   ProductService productService;

   public OrderService(ProductService productService) {
      this.productService = productService;
   }
   public String getProductName() {
      return productService.getProductName();
   }
}