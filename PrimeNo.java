class PrimeNo{
	public static void main(String arr[])
	{
		int number=Integer.parseInt(arr[0]);
		int i;
		int b=2,count;
		while(b<=number)
		{
		count=0;
		for(i=2;i<b;i++)
		{
			if((b%i)==0)
			{
				count++;
				break;
			}
			
		}
		if(count==0)
			System.out.println(b);
		b++;
		//System.out.println(b);
		}
	}
}