import java.util.Scanner;

class ifelse_voting
{
	public static void main(String args[])
	{
		int age;

		System.out.println("Enter your age");

		Scanner v=new Scanner(System.in);
		age=v.nextInt();

		if(age>18)
		{
			System.out.println("you are capable for voting");
		}

		else
		{
			System.out.println("you are not capable for voting");
		}
	}
}