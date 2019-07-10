class MoneyConversion
{
	/**
	* i.e "invalid number of arguments <br> Money Converter "money" "conversion type" <br>
		"conversion type" <br> 1.usd to inr <br> 2.inr to usd <br> "money" <br> appropriate money value
	**/
 public static void main(String arg[])
 {
	if(arg.length !=2)
	{
		System.out.println("invalid number of arguments");
		System.out.println(" Money Converter <money> <conversion type> ");
		System.out.println("<conversion type> \n 1.usd to inr \n 2.inr to usd is");
		System.out.println("<money> \n appropriate money value");
	}
	int money=Integer.parseInt(arg[0]);
	int ch=Integer.parseInt(arg[1]);
	int rate=70;
	if(ch==1)
	{
		System.out.println("usd to inr is" + money/70);
	}
	else
	{
	System.out.println("inr to usd is" + money*70);
	}
 }
}