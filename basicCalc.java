class basicCalc{
	public static void main(String arr[])
	{
		int firstNum=Integer.parseInt(arr[0]);
		int secondNum=Integer.parseInt(arr[1]);
		int c=Integer.parseInt(arr[2]);
		System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
		switch(c)
		{
			case 1:
			System.out.println("1.addition" + (firstNum+secondNum));
			break;
			case 2:
			System.out.println("2.subtraction" + (firstNum-secondNum));
			break;
			case 3:
			System.out.println("3.multiplication" + (firstNum*secondNum));
			break;
			case 4:
			System.out.println("4.division" + (firstNum/secondNum));
			break;
			
		}
	}
}