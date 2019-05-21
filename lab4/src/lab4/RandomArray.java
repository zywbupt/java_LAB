

/**
 * A class that represents a random array.
 *
 * @author   Ling Ma
 * @date     Jan 19, 2009    
 * @version  1.0
 * @author   Paula Fonseca
 * @date     Mar 28, 2017    
 * @version  1.2 
 * @author   Zhan Yiwen
 * @date     Mar 24, 2018    
 * @version  1.3 
 */
public class RandomArray {
    private int[] array; // instance variable

    /**
     *  Constructor
     *  @param  size  The size of the array.
     */
    public RandomArray(int size) {
        // write your code here
    	array = new int [size];
    	for (int i = 0; i<size ; i++) {
    		array[i] = (int) (Math.random()*10);
    	}
    }
	
    /**
     *  A method to print the array elements.
     */
    public void printArray() {
        // write your code here
    	for(int i = 0; i<array.length; i++ ) {
    		System.out.println(" "+array[i]);
    	}
    }
	
    /**
     *  A method to calculate the sum of all elements.
     *  @return  The sum.
     */
    public int calcSum() {
        // write your code here
    	int sum = 0;
    	for(int i = 0; i<array.length; i++ ) {
    		sum += array[i];
    	}
    	return sum;
    }

    /**
     *  A method to calculate the mean (or average) of all elements.
     *  @return  The mean.
     */
    public double calcMean() {
        // write your code here
    	double mean;
    	double sum = calcSum();
    	mean = sum/array.length;
    	return mean;
    }
	
    /**
     *  A main method to test.
     */
    public static void main(String[] args) {
        // Check to see if the user has actually sent a parameter to the method.
        if (args.length != 1) {
            System.out.println("Usage: java RandomArray <NUM>. Example: java RandomArray 5");
	    System.exit(-1);
        }

		// Create an instance of the class.
		RandomArray test = new RandomArray(Integer.parseInt(args[0]));
			
		// Print the array.
		test.printArray();
			
		// Calculate the sum of all the values in the array and print it.
		System.out.println("Sum: " + test.calcSum());
			
		// Calculate the mean of all the values in the array and print it.
		System.out.println("Mean: " + test.calcMean());
    }
}