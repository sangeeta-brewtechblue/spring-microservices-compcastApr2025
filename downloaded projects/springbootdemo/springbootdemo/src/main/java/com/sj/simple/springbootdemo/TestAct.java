package com.sj.simple.springbootdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;







public class TestAct {
	
	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotationconfig.xml");
			   	       
	  	 User person1=   (User) ctx.getBean("user1");
	  	 System.out.println(person1);
	   	 person1.withdrawFromAccount(3000);
	
	
	
	}
	
	
	
	
	

}
