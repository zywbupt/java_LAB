package lab9;


public class ParityBitAdder_v2 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			String str = "[^0-1] {7}#";
			if (!args[0].matches(str))
				throw new NoBinaryValueException();
			int num = Integer.parseInt(args[1]);
			if(num!=0 && num!=1)
				throw new IllegalParityValueException();
			
		}
		catch (IllegalParityValueException e) {
			System.out.println(e);
		}
		catch (NoBinaryValueException e) {
			System.out.println(e);
		}
		
		String newStr = ParityBitAdder_v2.calculateParity(args);
		System.out.println(newStr);

	}
	
	public static String calculateParity(String str[]) {
		String tempStr = "";
		if(str.length != 2)
			return null;
		tempStr = str[0].replace("0", "");
		if(tempStr.length() %2 == 0) {
			if(Integer.parseInt(str[1]) == 0) {
				return "Adding even parity to " +str[0]+ " results in the binary pattern 0" + str[0]+"'.";
			}
			else if (Integer.parseInt(str[1]) == 1) {
				return "Adding odd parity to " +str[0]+ "  results in the binary pattern 1" + str[0]+"'.";
			}
			else return null;
		}
		else if (tempStr.length() %2 == 1){
			 if(Integer.parseInt(str[1])==0){
	                return "Adding even parity to "+str[0]+" results in the binary pattern "+"1"+str[0]+"'.";
	            }
	            else if(Integer.parseInt(str[1])==1){
	                return "Adding odd parity to "+str[0]+" results in the binary pattern "+"0"+str[0]+"'.";
	            }
	            else return null;
		}
		return null;
	}

}
