import java.util.Scanner;

class attendence
{
	public static void main(String ars[])
	{
		int present;

		System.out.println("Enter Your Attendence");

		Scanner a=new Scanner(System.in);

		present=a.nextInt();

		if(present>=75)
		{
			System.out.println("You are Eligible for Exam");
		}

		else
		{
			System.out.println("Student attendence is"+present+"%");
			System.out.println("Processing.....");
			System.out.println("The student is not eligible for the exam");
		}
	}
}