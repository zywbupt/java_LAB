package lab9;

public class IllegalParityValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalParityValueException() {
		super("Error: The program's parity bit input"
				+ " (the second argument) must be either 0 or 1. "
				+ "Please try again!");
	}
}
