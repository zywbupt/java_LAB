package lab6Q2;

public class Troll extends Monster{

	public Troll(String name) {
		super(name);
		
		if (name.equals("Saul")||name.equals("Salomon")) {
			System.out.println("ERROR! The name can't be Sual or Salomom");
			super.setName("Detritus");
		}
	}
	
	public Troll (String name, double spAttackProbaility) {
		super(name,spAttackProbaility);
		
		if (name.equals("Saul")||name.equals("Salomon")) {
			System.out.println("ERROR! The name can't be Sual or Salomom");
			super.setName("Detritus");
		}
	}
	@Override
	public int specialAttack() {
		int damage = 1 + (int)(Math.random()*15);
		System.out.println(super.getName()+" of "+ this.getClass()+ " attacks by hiting with a club "+ damage +" points damage caused.");
		return damage;
		
	}
	

}
