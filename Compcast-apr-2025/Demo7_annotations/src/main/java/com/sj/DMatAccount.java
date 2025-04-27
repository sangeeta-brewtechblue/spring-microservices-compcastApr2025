/**
 * 
 */
package com.sj;

/**
 * @author Sangeeta
 *
 */
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
