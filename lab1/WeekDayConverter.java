public class WeekDayConverter{

	public static void main(String[] args){
		
		int weekDay = Integer.parseInt(args[0]);
		switch(weekDay){

			case 1:
				System.out.println("The 1 st day of the week is Monday.");
				break;
			case 2:
				System.out.println("The 2 nd day of the week is Tuesday.");
				break;
			case 3:
				System.out.println("The 3 rd day of the week is Wednesday.");
				break;
			case 4:
				System.out.println("The 4 th day of the week is Thursday.");
				break;
			case 5:
				System.out.println("The 5 th day of the week is Friday.");
				break;
			case 6:
				System.out.println("The 6 st day of the week is Saturday.");
				break;
			case 7:
				System.out.println("The 7 st day of the week is Sunday.");
				break;
			default:
				System.out.println("ERROR INPUT!");
		}
	}
}