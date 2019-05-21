public class Patterns {
	
	public void printPattern1(int n) {
		// Write your code here (taken from your solution of Question 2).
		int loopPatter = n;
		for (int i = 1; i<= loopPatter; i++){
		
			for (int j = 1; j <= i; j++)
				System.out.print(" "+j);
		
			System.out.println("");
		}
		
	}
	
	public void printPattern2(int n) {
		// Write your code here (taken from your solution of Question 3).
		int loopPatter = n;
		for (int i = loopPatter; i >0 ; i--){
		
			for (int j = 1 ; j <= i; j++)
				System.out.print(" "+j);
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args) { 
		// Write your code here. 
			int pattern = Integer.parseInt(args[0]);
			Patterns p=new Patterns();
			p.printPattern1(pattern);
			p.printPattern2(pattern);
	}
}