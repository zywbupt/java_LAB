package lab9;

public class NoBinaryValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoBinaryValueException() {
		super("Error: The first input to this program must be a 7-bit binary "
				+ "number. Please try again!");
	}

}
