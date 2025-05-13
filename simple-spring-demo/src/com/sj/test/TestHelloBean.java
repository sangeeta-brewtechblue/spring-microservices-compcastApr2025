/**
 * 
 */
package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.model.HelloBean;

/**
 * @author sange
 *
 */
public class TestHelloBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("beans.xml");
	
	  HelloBean b1=  (HelloBean) context.getBean("bean1");
	
	  b1.sayHello();   
	
	
	
	}

}
