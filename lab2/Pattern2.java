public class Pattern2 {
	
	public static void main(String[] args) {
		
		int loopPatter = Integer.parseInt(args[0]);
		for (int i = loopPatter; i >0 ; i--){
		
			for (int j = 1 ; j <= i; j++)
				System.out.print(" "+j);
			
			System.out.println("");
		}
	}
}