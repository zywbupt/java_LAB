package lab5;

import java.awt.Color;
import java.util.ArrayList;

public class DogTest3 {

	public static void main(String[] args) {

		ArrayList<Dog> dogList = new ArrayList<Dog>();
        
        Dog Dogs0 = new Dog("A","short", true , Color.BLACK, 100);
        Dog Dogs1 = new Dog("B","long", false , Color.GRAY, 200);
        Dog Dogs2 = new Dog("C","short", true , Color.BLACK, 300);
        Dog Dogs3 = new Dog("D","long", false , Color.GRAY , 400);
        Dog Dogs4 = new Dog("E","short", true , Color.BLACK, 500);
        Dog Dogs5 = new Dog("F","long", false , Color.GRAY, 400);
        
        dogList.add(Dogs0);
        dogList.add(Dogs1);
        dogList.add(Dogs2);
        dogList.add(Dogs3);
        dogList.add(Dogs4);
        dogList.add(Dogs5);
        
        System.out.println("The details of the Dog object at index 4:");
        System.out.println(dogList.get(4));
        
        System.out.println();
        System.out.println("The size of the ArrayList is : " + dogList.size());
        
        dogList.remove(3);
        System.out.println();
        
        for(int i=0; i<dogList.size(); i++) {
        	System.out.println("Index of "+ i + ": " );
        	System.out.println(dogList.get(i));
        	System.out.println();
        }
        
        
        
	}

}
