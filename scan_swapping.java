import java.util.Scanner;

class scan_swapping
{
    public static void main(String args[])
    {
        int a,b;

        int x,y,z;

        //swapping with 2 variable

        System.out.println("Enter 2 values for swapping with 2 variable");
        Scanner sp=new Scanner(System.in);
        a=sp.nextInt();
        b=sp.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("First value is="+a);
        System.out.println("Second value is="+b);


        //swapping with 3 variable

        System.out.println("Enter two values for swapping with 3 variable");
        x=sp.nextInt();
        y=sp.nextInt();

        z=x;
        x=y;
        y=z;

        System.out.println("Value of first is ="+x);
        System.out.println("Value of second is ="+y);

    }
}