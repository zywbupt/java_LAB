package lab6;

public class Troll extends Monster{

	public Troll(String name) {
		super(name);
		
		if (name.equals("Saul")||name.equals("Salomon")) {
			System.out.println("ERROR! The name can't be Sual or Salomom");
			super.setName("Detritus");
		}
	}
	
	

}
