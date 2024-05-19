import java.util.Scanner;

class switch_chocolate
{
	public static void main(String[] args) 
	{
		int choco;

		System.out.println("Enter...\n 1 for Melody \n 5 for 5 Star \n 10 for Kitkat \n 20 for Fuse \n 40 for Dairy Milk \n 100 for Cadbury Celebration");

		Scanner k=new Scanner(System.in);
		choco=k.nextInt();

		switch(choco)
		{
			case 1:
			System.out.println("Melody");
			break;

			case 5:
			System.out.println("5 Star");
			break;

			case 10:
			System.out.println("Kitkat");
			break;

			case 20:
			System.out.println("Fuse");
			break;

			case 40:
			System.out.println("Dairy Milk");
			break;

			case 100:
			System.out.println("Cadbury Celebration");
			break;

			default :
			System.out.println("Invalid..");
		}	
	}
}