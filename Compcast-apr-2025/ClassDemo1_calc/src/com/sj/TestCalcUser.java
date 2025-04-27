/**
 * 
 */
package com.sj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sangeeta
 *
 */
public class TestCalcUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			
	      User2 user = (User2) context.getBean("u1");
	
	
	      user.invokeCalculate();	
	
	}

}
