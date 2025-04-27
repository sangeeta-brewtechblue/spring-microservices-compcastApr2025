/**
 * 
 */
package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.model.Greet;

/**
 * @author sangeeta
 *
 */
public class TestGreet {


        public static void main(String[] args)  {
        	
                
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
                
                   Greet greet = (Greet) context.getBean("bean1");
                   greet.sayHello();
                   
      
        }
        



}