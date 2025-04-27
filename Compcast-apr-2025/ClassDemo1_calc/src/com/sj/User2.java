/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class User2 {

	Calc c;
	
	

	public User2() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("user instantiated");
	}
    
	
	
	public User2(Calc c) {
		super();
		this.c = c;
		System.out.println("user instantiated with param");
	}



	public Calc getC() {
		return c;
	}

	public void setC(Calc c) {
		System.out.println("setter inj: setting calc");
		this.c = c;
	}
	
	public void invokeCalculate() {
		c.calculate();
	}
	
	/**
	 * @param args
	 */
	

}
