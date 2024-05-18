import java.util.Scanner;

class ladder_grade
{
	public static void main(String[] args) 
	{
		int marks;

		System.out.println("Enter your marks..");

		Scanner s=new Scanner(System.in);
		marks=s.nextInt();

		if(marks>=95)
		{
			System.out.println("A+ grade");
		}

		else if(marks>=85 && marks<95)
		{
			System.out.println("A grade");
		}

		else if(marks>=75 && marks<85)
		{
			System.out.println("B+ grade");
		}

		else if(marks>=65 && marks<75)
		{
			System.out.println("B grade");
		}

		else if(marks>=45 && marks<65)
		{
			System.out.println("C grade");
		}

		else if(marks>=35 && marks<45)
		{
			System.out.println("PASS");
		}

		else if(marks<35)
		{
			System.out.println("Fail");
		}

		else
		{
			System.out.println("Invalid marks..");
		}

	}
}