/**
 * 
 */
package com.sj.simple.springbootdemo;

import org.springframework.stereotype.Component;

/**
 * @author satish
 *
 */
@Component
public class SavingAccount implements Account {

	
	public SavingAccount()
	{
		System.out.println("creating SavingAccount dependency");
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	     System.out.println("withdrawing from .. Saving Account"+amount);
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingAccount []";
	}
   
}
