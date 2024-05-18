import java.util.Scanner;

class count_total_number
{
	public static void main(String args[])
	{
		int amt;

		System.out.println("Enter the amount");

		Scanner k1=new Scanner(System.in);
		amt=k1.nextInt();

		int n500,n100,n50,n20,n10,n5,n2,n1;
		n500=n100=n50=n20=n10=n5=n2=n1=0;

		if(amt>=500)
		
			n500=amt/500;
			amt-=n500*500;

		if(amt>=100)

			n100=amt/100;
		    amt-=n100*100;

		if(amt>=50)

			n50=amt/50;
		    amt-=n50*50;


		if(amt>=10)

			n10=amt/10;
		    amt-=n10*10;

		if(amt>=5)

			n5=amt/5;
		    amt-=n5*5;


		if(amt>=2)

			n2=amt/2;
		    amt-=n2*2;


		if(amt>=1)

			n1=amt/1;
		    amt-=n1;


		    System.out.println("Total number of Notes");
		    System.out.println("500 ="+n500);
		    System.out.println("100 ="+n100);
		    System.out.println("50 ="+n50);
		    System.out.println("20 ="+n20);
		    System.out.println("10 ="+n10);
		    System.out.println("5 ="+n5);
		    System.out.println("2 ="+n2);
		    System.out.println("1 ="+n1);
	}
}