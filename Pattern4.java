/*
	0  3  8
	15 24 35
	48 63 80
*/

class Pattern4 
{
	
	public static void main(String[] args) 
	{
		int ino= 1;

		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 1; j <= 3; j++) 
			{
				System.out.print((ino*ino) - 1 + "  ");
				ino++;
			}

			System.out.println();
		}
	}
}