package lab9;

public class Chromosome {
	int []chromosomeArray;
	int num;
	public Chromosome(int arg[]) {
		try {
			num = arg.length;
			for(int i = 0; i<num; i++) {
				if(!(arg[i]==0||arg[i]==1))
					throw new NonBinaryValueException();
				else 
					chromosomeArray = arg;
			}
		}catch (NonBinaryValueException e) {
			e.printStackTrace();
			chromosomeArray = new int [num];
			for (int i=0; i<num; i++) {
				chromosomeArray[i] = 1;
			}
		}
	}
	public int getFitness() {
		int numOne = 0;
		for (int i=0 ;i<num; i++) {
			if (chromosomeArray[i]==1) 
				numOne++;
		}
		return numOne;
		
	}
	
	public String toString() {
		StringBuilder s= new StringBuilder();
		s.append("[");
		for(int i=0;i<(num-1);i++){
			s.append(chromosomeArray[i]);
			s.append(" ");
		}
		s.append(chromosomeArray[(num-1)]);
		s.append("]");
		return s.toString();
	}
	
	public static void main(String[] args) {
		int[] arry1 = {1,0,1,1,1,0,1};
		int[] arry2 = {3,5,2,2};
		Chromosome chro1 = new Chromosome(arry1);
		System.out.println(chro1);
		Chromosome chro2 = new Chromosome(arry2);
		System.out.println(chro2);
		
	}
}
