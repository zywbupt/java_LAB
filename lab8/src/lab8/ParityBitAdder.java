package lab8;

public class ParityBitAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[^0-1] {7}#";
		if (!args[0].matches(str)) {
			System.out.println("The first input is not correct.");
			return ;
		}
		int num = Integer.parseInt(args[1]);
		if(num!=0 && num!=1) {
			System.out.println("The second input is not correct.");
			return ;
		}
		String newStr = ParityBitAdder.calculateParity(args);
		System.out.println(newStr);

	}
	
	public static  String calculateParity(String str[]) {
		String tempStr = "";
		if(str.length != 2)
			return null;
		tempStr = str[0].replace("0", "");
		if(tempStr.length() %2 == 0) {
			if(Integer.parseInt(str[1]) == 0) {
				return "Adding even parity to '" +str[0]+ "' results in the binary pattern '0" + str[0]+"'.";
			}
			else if (Integer.parseInt(str[1]) == 1) {
				return "Adding odd parity to '" +str[0]+ "' results in the binary pattern '1" + str[0]+"'.";
			}
			else return null;
		}
		else if (tempStr.length() %2 == 1){
			 if(Integer.parseInt(str[1])==0){
	                return "Adding even parity to ‘"+str[0]+"’ results in the binary pattern ‘"+"1"+str[0]+"'.";
	            }
	            else if(Integer.parseInt(str[1])==1){
	                return "Adding odd parity to ‘"+str[0]+"’ results in the binary pattern ‘"+"0"+str[0]+"'.";
	            }
	            else return null;
		}
		return null;
	}
}
