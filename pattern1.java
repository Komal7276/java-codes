class pattern1
{
	static int n=7,d=1;
	

	public static void main(String[] args) 
	{
		int i,j;
		
		for(i=1;i<=n;i++)
		{

			for(j=1;(j<=n/2+1);j++)
			{
				if( j>=d)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print("");
				}

			}
		
		if(i<=n/2)
		{
			d++;
		}
		else
		{
			d--;
		}
			System.out.println("\n");
		}	
	}
}