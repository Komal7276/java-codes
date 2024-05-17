import java.util.Scanner;

class scan_simple_interest
{
    public static void main(String args[])
    {
        int principal,rate,year;
        double si;

        System.out.println("Enter the Principal");

        Scanner rest=new Scanner(System.in);
        principal=rest.nextInt();

        System.out.println("Enter the Rate");
        rate=rest.nextInt();

        System.out.println("Enter the Year");
        year=rest.nextInt();

        si=principal*rate*year/100;

        System.out.println("Simple Interest is ="+si);
    }
}