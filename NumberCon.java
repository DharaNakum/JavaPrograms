class NumberCon{
	/**
	* i.e "invalid number of arguments <br> Number Converter "number" "conversion type" <br>
		"conversion type" <br> 1.decimal to binary <br> 2.binary to decimal <br> "number" <br> appropriate number
	**/
	public static void main(String arr[])
	{
		if(arr.length !=2)
	{
		System.out.println("invalid number of arguments");
		System.out.println(" Number Converter <number> <conversion type> ");
		System.out.println("<conversion type> \n 1.decimal to binary \n 2.binary to decimal");
		System.out.println("<number> \n appropriate number");
	}
		int number=Integer.parseInt(arr[0]);
		double c=Integer.parseInt(arr[1]);
			int b[]=new int[12];
			double d,sum=0,s;
			int i=0;
			double base=2;
			if(c==1)
			{
    			while(number>0)
    			{
     		   		b[i]=number%2; 
       			 	number=(number/2);
     				i++;
			}

			i--;
			while(i>=0)
			{
			System.out.print(b[i--]);
			}
			}
			else
			{
			while(number>0)
   			{
        		d=number%10;
        		number=number/10;
        		s=Math.pow(base,i);
			sum=sum+(s*d);
        		i++;
			}
			System.out.println(sum);
			}
	}
}