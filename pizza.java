import java.util.Scanner;

class dominos
{
	float price;
	int quantity;

	static float total,t1,t2;


	Scanner s1=new Scanner(System.in);

	void dominos_pizza()
	{
		
		int pizza_price=199;
		System.out.println("------------------------------------------------------------------");

		System.out.println("Enter how many pizza you want :");
		quantity=s1.nextInt();

		t1=pizza_price*quantity;
	
		System.out.println("Pizza price "+pizza_price);
		System.out.println("Pizza quantity ="+quantity);
		System.out.println("Total of Pizza ="+t1);
	}


	void dominos_fries()
	{
		
		int price=99;
		System.out.println("------------------------------------------------------------------");

		System.out.println("Enter how many fries you want :");
		quantity=s1.nextInt();

		t2=price*quantity;
		
		System.out.println("Fries price "+price);
		System.out.println("Fries quantity ="+quantity);
		System.out.println("Total of Fries ="+t2);

		System.out.println("------------------------------------------------------------------");
	}
}


class pizza
{
	public static void main(String[] args) 
	{
		dominos q=new dominos();
		q.dominos_pizza();
		q.dominos_fries();
	}
}