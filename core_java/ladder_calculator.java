import java.util.Scanner;

class ladder_calculator
{
    public static void main(String args[])
    {
        int a;
        int b;
        char c;
        int d;

        System.out.println("enter the first value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();

        System.out.println("which operation do you want to perform");
        c=s1.next().charAt(0);

        System.out.println("enter the second value");
        b=s1.nextInt();

        if(c=='+')
        {
            d=a+b;
            System.out.println("addition="+d);
        }
       else if(c=='-')
       {
            d=a-b;
            System.out.println("subtraction="+d);
        }
        else if(c=='*')
        {
            d=a*b;
            System.out.println("multiplication="+d);
        }
        else if(c=='/')
        {
            d=a/b;
            System.out.println("division="+d);
        }

        else
        {
            System.out.println("Invalid Operator..");
        }

    }
}