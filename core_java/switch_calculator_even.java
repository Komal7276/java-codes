import java.util.Scanner;

class switch_calculator_even
{
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		int num;

       System.out.println("enter two numbers for arithmetic operation");
       Scanner s1=new Scanner(System.in);

       a=s1.nextInt();
       b=s1.nextInt();

       System.out.println("enter...\n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division"); 
       num=s1.nextInt();
      
       switch(num)
       {
       	case 1:

        c=a+b;
        System.out.println("addition="+c);

       	if(c%2==0)
       	{
       		System.out.println("your addition is even");
       	}
       	else
       	{
       		System.out.println("your addition is odd");
       	}

        break;
       

       	case 2:

        c=a-b;
        System.out.println("subtraction="+c);

       	if(c%2==0)
		    {
       		System.out.println("your subtraction is even");
       	}
       	else
       	{
       		System.out.println("your subtraction is odd");
       	}

        break;
 

       	case 3:

        c=a*b;
        System.out.println("multiplication="+c);

       	if(c%2==0)
       	{
       		System.out.println("your multiplication is even");
       	}
       	else
       	{
       		System.out.println("your addition is odd");
       	}
    
        break;
       

       	case 4:

        c=a/b;
        System.out.println("division="+c);

       	if(c%2==0)
       	{
       		System.out.println("your division is even");
       	}
       	else
       	{
       		System.out.println("your division is odd");
       	}

       break;

       default :
       System.out.println("Invalid Number..");
	   }
	}
}