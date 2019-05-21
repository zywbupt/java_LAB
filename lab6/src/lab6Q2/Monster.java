package lab6Q2;

public abstract class Monster {
	private String name;
	private double spAttackProbability = 0.2;
	
	 /**
     *  Constructor
     *  @param name
     */
	public Monster(String name) {
		this.name = name;
	}

    /**
     *  Constructor
     *  @param name spAttackProbability
     */
	public Monster(String name, double spAttackProbaility) {
		this.name = name;
		this.spAttackProbability = spAttackProbaility;
	}
	/**
	 *  A method to attack
	 *  @return the attack results
	 */
	public int attack() {
		int x=1+(int)(Math.random()*5);
		double type = Math.random();
		if (type >= spAttackProbability) {
			
			System.out.println(this.name+" of "+ this.getClass()+ " attacks generically "+ x +" points damage caused.");
			return x;
		}
		else 
			return specialAttack();
	}
	
	/**
	 * A method of specialAttack
	 * @return the specialAttack results
	 */
	public int specialAttack() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * A method about moving
	 * @param direction
	 */
	public void move(int direction) {
		switch(direction) {
			case 1:
				System.out.println(this.name + " is moving 1 step NORTH.");
				break;
			case 2:
				System.out.println(this.name + " is moving 1 step EAST.");
				break;
			case 3:
				System.out.println(this.name + " is moving 1 step SOUTH.");
				break;
			default:
				System.out.println(this.name + " is moving 1 step WEST.");
				break;
		}
	}
	/**
	 * Get the name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the special Attack Probability
	 * @return the probability of special attack
	 */
	public double getSpAttackProbability() {
		return spAttackProbability;
	}
	/**
	 * Set the probability of special attack
	 * @param spAttackProbability
	 */
	public void setSpAttackProbability(double spAttackProbability) {
		this.spAttackProbability = spAttackProbability;
	}
	
}
