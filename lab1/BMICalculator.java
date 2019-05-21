public class BMICalculator{
	public static void main(String[] args){
		float weight = Float.parseFloat(args[0]);
		float height = Float.parseFloat(args[1])/100;
		float BMI = weight/height/height;
			
		System.out.println("Your weight: "+weight+" kg");
		System.out.println("Your height: "+height+" m");
		System.out.println("Your BMI: "+BMI);
		if(BMI<18.5)
			System.out.println("You are in the Underweight range.");
		else if(BMI>18.5&&BMI<24.9)
			System.out.println("You are in the Normal range.");
		else if(BMI>25&&BMI<29.9)
			System.out.println("You are in the Overweight range.");
		else
			System.out.println("You are in the Obese range.");
	}
}			
			