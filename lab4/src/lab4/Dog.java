import java.awt.*;

/**
 * Title      : Dog.java
 * Description: This class contains the definition of a dog.
 * Copyright  : Copyright (c) 2006-2017
 * @author      Laurissa Tokarchuk
 * @version     1.0
 * @author      Paula Fonseca
 * @version     1.2
 * @author 		Zhan Yiwen
 * @version		1.3
 * @author 		Zhan Yiwen
 * @version		1.4
 */
public class Dog {  
    // Declaration of instance variables.
    private String  name, furType;
    private boolean tail;  
    private Color   colour; 
    private int  speed; 
    
    

    public Dog(String name, String furType, boolean tail, Color colour, int speed) {
    	 setName(name);
    	 setFurType(furType);
         setTail(tail);
         setColour(colour);	
         setSpeed(speed);
	}


	public Dog(String name, int speed) {
		setName(name);
		setSpeed(speed);
		
	}


	/** This is the sleep method for the dog. It dictates the number of 
     *  minutes the dog sleeps.
     * @param duration  The number of minutes to sleep.
     */
    public void sleep(int duration) {
        System.out.println("I am sleeping for " + duration + " minutes.");
    }
	

	/** This method allows the dog to run. The distance (in a straight line)
     *  the dog runs is dependent on how long the dog runs and whether or not
     *  it is running in a zigzag.
     *  @param duration  The number of minutes to run.
     *  @param zigzag    Whether to run in a zigzag pattern.
     *  @return int	 Number of metres ran.
     */
    public int run(int duration, boolean zigzag) {
        System.out.println("I am running "
                           + (zigzag? "in a zigzag" : "straight")
                           + " for "
                           + duration 
                           + " minutes.");	
        int distanceRun = duration * speed; // assuming speed is metres per minute
        if (zigzag) {
	    /* When in zigzag, distance is 1/3 of what it would have been if 
	       the dog was going straight. */
            return distanceRun/3; 
        } 
        else return distanceRun;
    }
    	
    //toString()
    public String toString() {
    	return "Name:" + this.name +"\nSpeed:" +
    			this.speed +"\nColour:"+this.colour+"\nTail:"+
    			this.tail+"\nFurtype:"+this.furType;
    }
    
    
    //getter and setter
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getFurType() {
    	return furType;
    }
    
    public void setFurType(String furType) {
    	this.furType = furType;
    }
    
    public int getSpeed() {
    	return speed;
    }
    
    public void setSpeed(int speed) {
    	this.speed = speed;
    }
    public boolean isTail() {
    	return tail;
    }
    
    
    public void setTail(boolean tail) {
    	this.tail = tail;
    }
    
    
    public Color getColour() {
    	return colour;
    }
    
    
    public void setColour(Color colour) {
    	this.colour = colour;
    }
}            