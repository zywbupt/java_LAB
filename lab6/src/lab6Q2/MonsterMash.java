package lab6Q2;

import java.util.*;

/**
 *  Title      : MonsterMash.java
 *  Description: This class is the test class for Monsters.
 *  @author  Laurissa Tokarchuk
 *  @version 1.0
 *  @author  Paula Fonseca
 *  @version 1.1
 *  @author  Zhan Yiwen
 *  @version 1.3
 */
public class MonsterMash {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        //monsters.add(new Monster("Tom"));
        //monsters.add(new Monster("George"));
        //abstract抽象类不能用new实例化对象，abstract方法只允许声明不能实现。

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
