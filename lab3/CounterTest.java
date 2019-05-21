 /**
 * Title      : Counter.java
 * Description: This class contains the test for the Counter.
 * Copyright  : Copyright (c) 2006-2018
 * @author Zhan Yiwen
 * @version 1.0
 */
public class CounterTest {

	public static void main(String[] args) {
		
		//create a Counter object
		Counter c = new Counter();
		
		//call the  getter and setter methods
		System.out.println("Before setter:");
		System.out.println(c);	
		c.setCount(2);
		c.setMax(10);
		System.out.println("After setter:");
		System.out.println(c);
		
		//four methods to test the functions of Counter
		System.out.println("Testing method increase()");
		for(int i = 0; i<4; i++) {
			c.increase();
			System.out.println(c);
		}
		
		System.out.println("Testing method decrease()");
		for(int i = 0; i<4; i++) {
			c.decrease();
			System.out.println(c);
		}
		
		System.out.println("Testing method increase(int n)");
		c.increase(3);
		System.out.println(c);	
		
		System.out.println("Testing method decrease(int n)");
		c.decrease(2);
		System.out.println(c);	
	
	}

}
