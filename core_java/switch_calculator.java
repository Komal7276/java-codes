import java.util.Scanner;

class switch_calculator
{
	public static void main(String[] args) 
	{
		int f;
		int s;
		int c;
		char opr;

		System.out.println("Enter First Number");

		Scanner v=new Scanner(System.in);
		f=v.nextInt();

		System.out.println("Which operation do you want to perform");
		opr=v.next().charAt(0);

		System.out.println("Enter Second Number");
		s=v.nextInt();

		switch(opr)
		{
			case '+':
			c=f+s;
			System.out.println("Addition ="+c);
			break;

			case '-':
			c=f-s;
			System.out.println("Subtraction ="+c);
			break;

			case '*':
			c=f*s;
			System.out.println("Multiplication ="+c);
			break;

			case '/':
			c=f/s;
			System.out.println("Division ="+c);
			break;

			case '%':
			c=f%s;
			System.out.println("Modulo Division ="+c);
			break;

			default:
			System.out.println("Invalid Operator..");
		}	
	}
}