class simple_interest
{
    public static void main(String args[])
    {
        int principal=1000;
        int rate=50;
        int year=5;
        double si;

        si=principal*rate*year/100;

        System.out.println("Simple Interest is ="+si);
    }
}