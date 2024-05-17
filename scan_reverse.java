import java.util.Scanner;

class scan_reverse
{
    public static void main(String args[])
    {
        int n;
        int a,b,c,d,e,f;
        int rev;

        System.out.println("Enter any 6 digit number");

        Scanner rr=new Scanner(System.in);
        n=rr.nextInt();

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

        f=n%10;
        n=n/10;

        rev=(a*100000)+(b*10000)+(c*1000)+(d*100)+(e*10)+(f*1);

        System.out.println("Reverse number is ="+rev);
    }
}