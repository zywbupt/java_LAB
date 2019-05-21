public class CountUpExample {
	
	public void countDown(int count) {
	
		for (int i=0; i < count; i++)
		System.out.println(i);
	System.out.println("\nAll done!");
	}
	
	
	public static void main (String[] args) {
		CountDownExample q = new CountDownExample();
		q.countDown(5);
	}
}