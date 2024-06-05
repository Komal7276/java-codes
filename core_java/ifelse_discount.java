import java.util.Scanner;

class ifelse_discount
{
	public static void main(String args[])
	{
		int shop;
		int dis;
		int total;

		System.out.println("Enter your shopping amount");

		Scanner a=new Scanner(System.in);
		shop=a.nextInt();

		if(shop>=10000)
		{
			dis=shop*25/100;
			System.out.println("Discount is="+dis);

			total=shop-dis;
			System.out.println("Your total bill is="+total);
		}

		else
		{
			System.out.println("You dont get any discount");
		}


	}
}