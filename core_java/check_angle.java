import java.util.Scanner;

class check_angle
{
	public static void main(String args[])
	{
		int angle;

		System.out.println("Enter Angle");

		Scanner k=new Scanner(System.in);
		angle=k.nextInt();

		if(angle>=0 && angle<=90)
		{
			System.out.println("This is Acute angle");
		}

		else if(angle==90)
		{
			System.out.println("This is Right angle");
		}

		else if(angle>=90 && angle<=180)
		{
			System.out.println("This is Obtuse angle");
		}

		else
		{
			System.out.println("There is no any angle");
		}

	}
}