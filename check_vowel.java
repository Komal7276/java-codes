import java.util.Scanner;

class check_vowel
{
	public static void main(String args[])
	{
		char c;

		System.out.println("Enter a Character");
		
		Scanner z=new Scanner(System.in);
		c=z.next().charAt(0);

		if( (c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
		{
			System.out.println("This is Vowel");
		}

		else
		{
			System.out.println("This is Consonant");
		}
	}
}