package com.sj.simple.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		
		System.out.println("in main");
		ApplicationContext context =	SpringApplication.run(SpringbootdemoApplication.class, args);
		 User person1=   (User) context.getBean("user1");
	  	 System.out.println(person1);
	  	 person1.withdrawFromAccount(3000);
	
		
		
	}

}
