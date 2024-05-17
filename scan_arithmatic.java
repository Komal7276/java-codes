import java.util.Scanner;

class scan_arithmatic
{
    public static void main(String args[])
    {
        int a,b,c;

        System.out.println("Enter two numbers");

        //variable scan------------------------
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();

        //addition---------------------------------
        c=a+b;
        System.out.println("Addition is ="+c);

        //subtraction------------------------------
        c=a-b;
        System.out.println("Subtraction is ="+c);

        //multiplication----------------------------
        c=a*b;
        System.out.println("Multiplication is ="+c);

        //division----------------------------------
        c=a/b;
        System.out.println("Division is ="+c);

        //modulo division-----------------------------
        c=a%b;
        System.out.println("Modulo Division is ="+c);

        
    }
}