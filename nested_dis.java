import java.util.Scanner;

class nested_dis
{
	public static void main(String[] args) 
	{
		int shop;
		int total;
		int dis;

		System.out.println("Enter Your Shopping Amount");

		Scanner k=new Scanner(System.in);
		shop=k.nextInt();

		if(shop>=15000)
		{
			if(shop>35000)
			{
				dis=shop*35/100;
				System.out.println("You got discount of Rs-"+dis);

				total=shop-dis;
				System.out.println("Total Bill ="+total);
			}

			else
			{
				dis=shop*28/100;
				System.out.println("You got discount of Rs-"+dis);

				total=shop-dis;
				System.out.println("Total Bill ="+total);
			}
		}

		else
		{
			if(shop<15000 && shop>8000)
			{
				dis=shop*15/100;
				System.out.println("You got discount of Rs-"+dis);

				total=shop-dis;
				System.out.println("Total Bill ="+total);
			}

			else
			{
				dis=shop*7/100;
				System.out.println("You got discount of Rs-"+dis);

				total=shop-dis;
				System.out.println("Total Bill ="+total);
			}
		}	
	}
}