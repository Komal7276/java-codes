import java.util.Scanner;

class ifelse_passfail
{
	public static void main(String args[])
	{
		int marks;

		System.out.println("Enter your marks");
		Scanner k=new Scanner(System.in);

		marks=k.nextInt();

		if(marks>=35)
		{
			System.out.println("you are pass");
		}

		else
		{
			System.out.println("you are fail");
		}
	}
}