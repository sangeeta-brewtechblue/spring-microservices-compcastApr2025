/**
 * 
 */
package com.sj.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.client.User;

/**
 * @author sange
 *
 */
public class TestUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      ApplicationContext context = new 
    		  ClassPathXmlApplicationContext("beans.xml");
	
	  User user = (User) context.getBean("user1");
	  
	  user.invokeSqrroot(13);
	
	
	}

}
