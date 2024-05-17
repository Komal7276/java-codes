class reverse
{
    public static void main(String args[])
    {
        int n=54321;
        int a,b,c,d,e;
        int rev;

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

        rev=(a*10000)+(b*1000)+(c*100)+(d*10)+(e*1);

        System.out.println("Reverse number is ="+rev);
    }
}