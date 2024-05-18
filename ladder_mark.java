import java.util.Scanner;

class ladder_mark
{
	public static void main(String args[])
	{
		int year;

		System.out.println("****** Welcome ******");
		System.out.println("Results Available of The Year:");
		System.out.println("2020");
		System.out.println("2021");
		System.out.println("2022");
		System.out.println("2023");
		System.out.println("Enter year which your Results you want");

		Scanner p=new Scanner(System.in);

		year=p.nextInt();

		if(year==2020)
		{
			System.out.println("__________________________________________________________________");
			System.out.println("|     Name     |     Roll No    |     Div     |     Precentage    |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Komal     |      12        |      C      |       85%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Pavan     |      34        |      B      |       95%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Sharad     |      69        |      A      |       90%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Aditya    |      57        |      C      |       85%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|     Mohini   |      62        |      G      |       75%         |");
			System.out.println("__________________________________________________________________");
		
		}

		else if(year==2021)
		{

			System.out.println("__________________________________________________________________");
			System.out.println("|     Name     |     Roll No    |     Div     |     Precentage    |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Prachi    |      84        |      C      |       85%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Nisha     |      83        |      D      |       90%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Sharaddha  |      19        |      A      |       78%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Vaishnav  |      57        |      C      |       94%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|     Rohit    |      62        |      G      |       89%         |");
			System.out.println("__________________________________________________________________");
		
		}

		else if(year==2022)
		{

			System.out.println("__________________________________________________________________");
			System.out.println("|     Name     |     Roll No    |     Div     |     Precentage    |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Pratiksha  |      15        |      A      |       97%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Nishant   |      63        |      D      |       83%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Sharaddha  |      39        |      C      |       98%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Vaishnavi |      17        |      E      |       86%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Samadhan   |      2         |      C      |       79%         |");
			System.out.println("__________________________________________________________________");
		}


		else if(year==2023)
		{

			System.out.println("__________________________________________________________________");
			System.out.println("|     Name     |     Roll No    |     Div     |     Precentage    |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Aditi      |      100       |      C      |       96%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Mahadev   |      55        |      B      |       85%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Radhika    |      38        |      C      |       98%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|    Vaibhavi  |      1         |      F      |       85%         |");
			System.out.println("__________________________________________________________________");
			System.out.println("|   Shivdas    |      20        |      A      |       89%         |");
			System.out.println("__________________________________________________________________");
		}

	
		else
		{
			System.out.println("This year Results are not Available");
		}
	}
}