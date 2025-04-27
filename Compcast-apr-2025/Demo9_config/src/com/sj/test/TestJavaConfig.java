/**
 * 
 */
package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sj.config.AppConfig;
import com.sj.model.Calc1;
import com.sj.model.CalcService;

/**
 * @author sangeeta
 *
 */
public class TestJavaConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
        CalcService  obj = (CalcService) context.getBean("calc2");
 
         obj.calculate(4, 9, "add");
	
	
	
	}

}
