class area
{
    public static void main(String args[])
    {
        int r=23;

        int b=20;
        int h=15;

        int side=35;

        int length=27;
        int width=33;

        double area;

        //area of circle---------------------------------------
        area=3.14*r*r;
        System.out.println("Area of Circle is ="+area);

        //area of triangle-------------------------------------
        area=b*h/2;
        System.out.println("Area of Triangle is ="+area);

        //area of square--------------------------------------
        area=side*side;
        System.out.println("Area of Square is ="+area);


        //area of rectangle-----------------------------------
        area=length*width;
        System.out.println("Area of Rectangle is ="+area);
    }
}