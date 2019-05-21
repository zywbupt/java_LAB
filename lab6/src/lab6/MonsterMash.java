package lab6;

import java.util.*;

/**
 *  Title      : MonsterMash.java
 *  Description: This class is the test class for Monsters.
 *  @author  Laurissa Tokarchuk
 *  @version 1.0
 *  @author  Paula Fonseca
 *  @version 1.1
 */
public class MonsterMash {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        monsters.add(new Monster("Tom"));
        monsters.add(new Monster("George"));

        monsters.add(new Dragon("Smaug"));
        monsters.add(new Dragon("Jabosh"));

        monsters.add(new Troll("Salomon"));
        monsters.add(new Troll("Bender"));

	int damageDone = 0;
	while (damageDone < 100) {
	    for (Monster m : monsters) {
	        m.move((int)(Math.random()*4) + 1);
		damageDone += m.attack();
	    }
	}
    }
}
