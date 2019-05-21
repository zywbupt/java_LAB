package lab5;

import java.awt.Color;

public class DogTest2 {

	public static void main(String[] args) {
		int i;
        Dog[] Dogs=new Dog[6];
        Dogs[0] = new Dog("A","short", true , Color.BLACK, 100 );
        Dogs[1] = new Dog("B","long", false , Color.GRAY, 200);
        Dogs[2] = new Dog("C","short", true , Color.BLACK, 300);
        Dogs[3] = new Dog("D","long", false , Color.GRAY , 400);
        Dogs[4] = new Dog("E","short", true , Color.BLACK, 500);
        Dogs[5] = new Dog("F","long", false , Color.GRAY, 400);

        for(i=0;i<=5;i++)
        {
            System.out.println("This is the "+(i+1)+" dog");
            System.out.println(Dogs[i]);
            System.out.println("");
        }

	}

}
