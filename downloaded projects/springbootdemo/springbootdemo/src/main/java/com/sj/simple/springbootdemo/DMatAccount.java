/**
 * 
 */
package com.sj.simple.springbootdemo;

import org.springframework.stereotype.Component;

/**
 * @author Sangeeta
 *
 */
@Component(value="account2")
public class DMatAccount implements Account {

	
	public DMatAccount()
	{
		System.out.println("creating DMATAccount dependency");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DMatAccount []";
	}

	/* (non-Javadoc)
	 * @see com.sj.Account#withdraw(double)
	 */
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

		 System.out.println("Withdrawing from... DMat Account"+amount);
	
	
	}

}
