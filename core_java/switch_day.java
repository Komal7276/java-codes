import java.util.Scanner;

class switch_day
{
	public static void main(String[] args) 
	{
		int day;

		System.out.println("Enter a Number in Between 1 to 7");

		Scanner k=new Scanner(System.in);
		day=k.nextInt();

		switch(day)
		{
			case 1:
			System.out.println("Monday");
			break;

			case 2:
			System.out.println("Tuesday");
			break;

			case 3:
			System.out.println("Wednesday");
			break;

			case 4:
			System.out.println("Thursday");
			break;

			case 5:
			System.out.println("Friday");
			break;

			case 6:
			System.out.println("Saturday");
			break;

			case 7:
			System.out.println("Sunday");
			break;

			default :
			System.out.println("Invalid Number...");
		}


	}
}