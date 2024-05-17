import java.util.Scanner;

class prime
{
	public static void main(String[] args) 
	{
		int n;
		int icount=0;
		int i;
		System.out.println("Enter a Number to check it is primr or not :");
		Scanner k=new Scanner(System.in);
		n=k.nextInt();

		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				icount++;
			}
		}

		if(icount==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	

	}
}