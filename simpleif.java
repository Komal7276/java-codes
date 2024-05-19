import java.util.Scanner;

class simpleif
{
	public static void main(String args[])
	{

		//less than.........................................
		int a;

		System.out.println("Enter number to check the number is less than 50 or not");

		Scanner k1=new Scanner(System.in);

		a=k1.nextInt();


		if(a<50)
		{
			System.out.println("This number is less than 50");
		}


		// greater than......................................
		int b;

		System.out.println("Enetr number to check the number is greater than 100 or not");

		b=k1.nextInt();

		if(b>100)
		{
			System.out.println("This number is gerater than 100 ");
		}

		//less than equal.........................................
		int c;

		System.out.println("Enter number to check the number is less than or equal to 100");

		c=k1.nextInt();

		if(c<=100)
		{
			System.out.println("This number is less than or equal to 100");
		}

		//greater than equal.......................................

		int d;

		System.out.println("Enter number to check the number is greater than or equal to 50");

		d=k1.nextInt();

		if(d>=50)
		{
			System.out.println("This number is greater than or equal to 50");
		}

		//strictly equal........................................

		int e;

		System.out.println("Enter number to check the number is euqal to 50");

		e=k1.nextInt();

		if(e==50)
		{
			System.out.println("It is equal to 50");
		}


		//not equal............................................

		int f;

		System.out.println("Enter number to check the number is not equal to 100");

		f=k1.nextInt();

		if(f!=100)
		{
			System.out.println("It is not equal to 100");
		}

	}
}