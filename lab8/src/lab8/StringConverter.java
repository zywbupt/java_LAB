package lab8;

public class StringConverter {
	

	public StringConverter(String string) {
		for (int i = 0; i<string.length(); i++) {
			if(Character.isLetter(string.charAt(i)) == true ) {
				if(string.charAt(i) == 'A' ||string.charAt(i) == 'E' 
				||string.charAt(i) == 'I' ||string.charAt(i) == 'O' 
				||string.charAt(i) == 'U' ||string.charAt(i) == 'Y' 
				||string.charAt(i) == 'a' ||string.charAt(i) == 'e' 
				||string.charAt(i) == 'i' ||string.charAt(i) == 'o' 
				||string.charAt(i) == 'u' ||string.charAt(i) == 'y' )
					System.out.print(Character.toLowerCase(string.charAt(i)));
				else
					System.out.print(Character.toUpperCase(string.charAt(i)));
					
			}
			else 
				System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new StringConverter(args[0]);
	}

}
