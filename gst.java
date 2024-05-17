class gst
{
	public static void main(String args[])
	{
		int price=5000;
		int gst_amount;
		int total_amount;

		gst_amount=price*18/100;

		System.out.println("Gst ="+gst_amount);

		total_amount=price+gst_amount;

		System.out.println("Total Bill ="+total_amount);

	}
}