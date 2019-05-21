package lab6Q2;

/**
 *  Title      : Dragon.java
 *  Description: This class is the class for a kind of Monsters called Dragon.
 *  @author  Zhan Yiwen
 *  @version 1.0
 */

public class Dragon extends Monster {

	public Dragon(String name) {
		super(name);
	}
	
	
	public Dragon(String name, double spAttackProbaility) {
		super(name, spAttackProbaility);
	}

	@Override
	public int specialAttack() {
		int damage = 1 + (int)(Math.random()*50);
		System.out.println(super.getName()+" of "+ this.getClass()+ " attacks by breathing fire "+ damage +" points damage caused.");
		return damage;
	}
}

