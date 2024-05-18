import java.util.Scanner ;

class ifelse_grace
{
	public static void main(String args[])
	{
		int marks;
		int grace_marks;

		System.out.println("Enter your marks");

		Scanner p=new Scanner(System.in);
		marks=p.nextInt();

		if(marks>80)
		{
			grace_marks=marks+5;
			System.out.println("Total marks="+grace_marks);
		}

		else
		{
			System.out.println("You dont get exra marks");
		}

	}
}