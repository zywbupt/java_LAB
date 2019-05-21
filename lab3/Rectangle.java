

/**
 * Title      : Rectangle.java
 * Description: This class contains the length and width of a rectangle, and calculates the area of it.
 * Copyright  : Copyright (c) 2006-2018
 * @author Zhan Yiwen
 * @version 1.0
 */
public class Rectangle {
	
	// Declaration of instance variables.
	private int l; 
	private int w; 
	
	public Rectangle(int l, int w) {
		setL(l);
		setW(w);
	}
	
	/**
	 * A method to calculate the area of the rectangle
	 * @return area
	 */
	public int calculateArea() {
		int area = l*w;
		return area;
	}
	
	public int calculateC() {
		int c = 2 * (l+w);
		return c;
	}

	// Get and set the value of rectangle's length
	public int getL() {
		return l;
	}
	
	public void setL(int l) {
		this.l = l;
	}
	
	// Get and set the value of rectangle's weight
	public int getW() {
		return w;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	
	
	//A main() method to test the Calculator
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(8, 6);
		Rectangle rectangle2 = new Rectangle(7, 7);
		
		//Calculate the ares of rectangle1 and rectangle2
		int area1 = rectangle1.calculateArea();
		int area2 = rectangle2.calculateArea();
		int c1 = rectangle1.calculateC();
		int c2 = rectangle2.calculateC();
		
		System.out.println("The area of the first rectangle is "+ area1 );
		System.out.println("The area of the second rectangle is "+ area2 );
		System.out.println("The circle of the first rectangle is "+ c1 );
		System.out.println("The circle of the second rectangle is "+ c2 );

	}
	

}
