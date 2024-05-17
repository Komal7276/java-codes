import java.util.Scanner;

class factors
{
	public static void main(String[] args) 
	{
		int ino;
		int icnt;
		System.out.println("Enter a number to find its factors :");

		Scanner s1=new Scanner(System.in);
		ino=s1.nextInt();

		for(icnt=1;icnt<=ino/2;icnt++)
		{
			if(ino%icnt==0)
			{
				System.out.println(icnt);
			}
		}	
	}
}