package lab6;

public class Dragon extends Monster {

	public Dragon(String name) {
		super(name);
	}
	
	public int attack() {
		int attackType = 1 + (int)(Math.random()*10);
		if(attackType<=3) {
			int damage = 1 + (int)(Math.random()*50);
			System.out.println(super.getName()+" of "+ this.getClass()+ " attacks by breathing fire "+ damage +" points damage caused.");
			return damage;
		}
		else 
			return super.attack();
	}
}
