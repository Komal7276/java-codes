class swapping
{
    public static void main(String args[])
    {
        int a=100;
        int b=10;

        int x=40;
        int y=50;
        int z;

        //swapping with 2 variable

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("swapping with 2 variable");

        System.out.println("Value of a is ="+a);
        System.out.println("Value of b is ="+b);


        //swappng with 3 variable

        
        z=x;
        x=y;
        y=z;

        System.out.println("swapping with 3 variable");

        System.out.println("Value of x is ="+x);
        System.out.println("Value of y is ="+y);
    }
}