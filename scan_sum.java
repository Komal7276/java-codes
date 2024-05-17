import java.util.Scanner;

class scan_sum
{
    public static void main(String args[])
    {
        int n;
        int a,b,c,d,e;
        int summ;

        System.out.println("Enter any 5 digit number");

        Scanner sm=new Scanner(System.in);
        n=sm.nextInt();

        a=n%10;
        n=n/10;

        b=n%10;
        n=n/10;

        c=n%10;
        n=n/10;

        d=n%10;
        n=n/10;

        e=n%10;
        n=n/10;

        summ=a+b+c+d+e;

        System.out.println("Summation is ="+summ);
    }
}