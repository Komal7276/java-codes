import java.util.Scanner;

class arithmatic 
{
	static int ino1,ino2;
	
	void addition()
	{
		System.out.println("Addition ="+(ino1+ino2));
	} 

	void subtraction()
	{
		System.out.println("Subtraction ="+(ino1-ino2));
	}

	void multiplication()
	{
		System.out.println("Multiplication ="+(ino1*ino2));
	}

	void division()
	{
		System.out.println("Division ="+(ino1/ino2));
	}

	void modulo()
	{
		System.out.println("Modulo division ="+(ino1%ino2));
	}

	public static void main(String args[])
	{

		arithmatic s=new arithmatic();

		Scanner s1=new Scanner(System.in);

	     System.out.println(" Enter two numbers to perform arithmatic operation : ");
	     ino1=s1.nextInt();
	 	 ino2=s1.nextInt();

		
		s.addition();
		s.subtraction();
		s.multiplication();
		s.division();
		s.modulo();

	}
}