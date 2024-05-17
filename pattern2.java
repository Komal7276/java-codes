class pattern2
{
	static int n=7,d=1;
	

	public static void main(String[] args) 
	{
		int i,j;
		
		for(i=1;i<=n;i++)
		{
				if( d%2==1)
				{
					for(j=1;(j<=d);j++)
					{
						System.out.print("*");
					}
				}
				else
				{
					System.out.print("");
				}

			
		
		if(i<=n/2)
		{
			d=d+2;
		}
		else
		{
			d=d-2;
		}
			System.out.println("\n");
		}	
	}
}