 
/**
 * Title      : Counter.java
 * Description: This class contains the function of a Counter.
 * Copyright  : Copyright (c) 2006-2018
 * @author Zhan Yiwen
 * @version 1.0
 */

public class Counter {
	// Declaration of instance variables.
	private int count, max;
	
	//a default constructor
	public Counter() {
		
		this.count = 0;
		this.max = 10;
	}

	/**
	 * This method increase the value by 2
	 */	
	public void increase() {
		this.count +=2;
		if (this.count > this.max) 
			reset();
	}
	
	/**
	 * This method decrease the value by 1
	 */
	public void decrease() {
		if (this.count >0)
			this.count--;
	}
	
	/**
	 * This method double the value
	 */
	public void doubler() {
		this.count = this.count*2;
		if (this.count >= this.max) 
			reset();
	}

	/**
	 * This method reset the value
	 */
	public void reset() {
		this.count = 0;
		System.out.println("Counter reset!");
		
	}
	
	/**
	 * This method increase the value by n
	 * If the value is larger than max, reset it
	 * @param n int number to increase by
	 */
	public void increase(int n) {
		this.count = this.count + n;
		if (this.count >= max)
			reset();
	}
	
	/**
	 * This method decrease the value by n
	 * If the value is smaller than max, give a warning
	 * @param n int number to decrease by
	 */
	public void decrease(int n) {
		if(this.count > n)
			this.count = this.count - n;
		else 
			System.out.println("The count is too small");
	}
	
	/**
	 * This method display the current values of count and max
	 */
	public String toString() {
		return "Now the count is " + this.count +". The max is " + this.max;
	}

	//setters and getters for the two instance variables
	public int getCount() {
		return count;
	}

	public void setCount(int n) {
		this.count = n;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int n) {
		this.max = n;
	}
	

}
