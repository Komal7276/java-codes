class array_even_odd
{
	public static void main(String[] args) 
	{

		for(int i=1;i<=10;i++)
		{
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		

			if(arr[i]%2==0)
			{
				System.out.println("Even number :");
				System.out.println(arr[i]+"="+arr[i]*2+"\n");

			}
			else
			{
				System.out.println("Odd number :");
				System.out.println(arr[i]+"="+arr[i]*3+"\n");
			}
		}
	}
}