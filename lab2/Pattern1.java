public class Pattern1 {
	
	public static void main(String[] args) {
		
		int loopPatter = Integer.parseInt(args[0]);
		for (int i = 1; i<= loopPatter; i++){
		
			for (int j = 1; j <= i; j++)
				System.out.print(" "+j);
		
			System.out.println("");
		}
	}
}
	