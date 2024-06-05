import java.util.Scanner;

class nested_even
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a Number..");

		Scanner p=new Scanner (System.in);
		a=p.nextInt();

		if(a>=0)
		{
			if(a%2==0)
			{
				System.out.println("This is Even & positive Number");
			}

			else
			{
				System.out.println("This is Odd & positive Number");
			}
		}

		else
		{
			if(a<0)
			{
				System.out.println("This is Negative Number");
			}

			else
			{
				System.out.println("This is not a Number ");
			}
		}	
	}
}