
class NumberDivision{
	public static void main(String arr[]){
	if(arr.length !=3)
	{
	System.out.println("Number division <Number> <division>");
	System.out.println("\n<Number> enter one number");
	System.out.println("\n<division>enter range");
	}
	
		int number=Integer.parseInt(arr[0]);
		int n1=Integer.parseInt(arr[1]);
		int n2=Integer.parseInt(arr[2]);
		int i;
		boolean value=false;
		for(i=n1;i<n2;i++)
		{
			if((number%i)==0)
			{
				System.out.println(i);
				value=true;
				System.exit(0);
			}
		
		}
		if(value==false)
		{
			System.out.println("not divided in this range");
		}
		
	}
}	