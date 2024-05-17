import java.util.Scanner;

class scan_gst
{
	public static void main(String args[])
	{
		int price;
		int gst_amount;
		int total_amount;

		System.out.println("Enter your shopping amount");

		Scanner gs=new Scanner(System.in);
		price=gs.nextInt();

		gst_amount=price*18/100;

		System.out.println("Gst amount ="+gst_amount);

		total_amount=price+gst_amount;

		System.out.println("Total Bill ="+total_amount);
		
	}
}