class sum
{
    public static void main(String args[])
    {
        int n=12345;
        int a,b,c,d,e;
        int summ;

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