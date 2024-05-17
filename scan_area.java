import java.util.Scanner;

class scan_area
{
    public static void main(String args[])
    {
        int radius;

        int b;
        int h;

        int side;

        int length ;
        int width;

        double area;

        //area of circle------------------------------

        System.out.println("Enter the radius");
        
        Scanner k1=new Scanner(System.in);

        radius=k1.nextInt();

        area=3.14*radius*radius;

        System.out.println("Area of Circle is ="+area);

        //area of triangle-----------------------------

        System.out.println("Enter base & height of Triangle");

        b=k1.nextInt();
        h=k1.nextInt();

        area=b*h/2;

        System.out.println("Area of Triangle is ="+area);

        //area of square---------------------------------

        System.out.println("Enter the side of square");

        side=k1.nextInt();

        area=side*side;

        System.out.println("Area of Square is ="+area);


        //area of rectangle----------------------------

        System.out.println("Enter the lenght & width of rectangle");

        length=k1.nextInt();
        width=k1.nextInt();

        area=length*width;

        System.out.println("Area of Rectangle is ="+area);

        
    }
}
