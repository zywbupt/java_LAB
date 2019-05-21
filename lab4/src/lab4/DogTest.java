
import java.awt.*;


/**
 * Title      : DogTest.java
 * Description: This class contains the test class for Dog.
 * Copyright  : Copyright (c) 2006 - 2017
 * @author  Laurissa Tokarchuk
 * @version 1.0
 * @author  Paula Fonseca
 * @version 1.2
 * @author 	Zhan Yiwen
 * @version	1.3
 */

public class DogTest {
    public static void main(String[] args) {
        /* 
         * first question's answer
         * Dog d = new Dog();
         * d.setName("Napoleon");
         * d.setSpeed(300); // in metres per minute
         * d.sleep(5);
         * int m = d.run(10, true);
         * System.out.println("I have run " + m + " metres.");	
         */
    	Dog d = new Dog("Napoleon", 300);
    	d.sleep(5);
        int m = d.run(10, true);
        System.out.println("I have run " + m + " metres.");
        
        Dog dog1 = new Dog("Buddy", "short" , true ,Color.BLACK, 500 );
        Dog dog2 = new Dog("Beethoven", "long" , false ,Color.GRAY, 400 );
        
        System.out.println("Dog1:"+"  Name:"+dog1.getName()+"  "+"Colar:"+dog1.getColour());
        dog1.run(10,false);
        System.out.println("");
        System.out.println("Dog2:"+"  Name:"+dog2.getName()+"  "+"Colar:"+dog2.getColour());
        dog2.run(5,true);
    }
}