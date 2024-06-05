import java.util.Scanner;

class alphabet
{
	public static void main(String args[])
	{

		char ch;

		
		Scanner s1=new Scanner(System.in);

		System.out.println("ENter the character : ");

		ch=s1.next().charAt(0);

		if(ch>='a' && ch<='z'  ||  ch>='A' && ch<='Z')
		{
			System.out.println("This a Alphabet");
		}

		else
		{
			System.out.println("This is not Alphabet");
		}
	}
}