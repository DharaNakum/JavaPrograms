class Enrollno{
	public static void main(String arr[])
	{
	String enrollno=arr[0];
	int enroll_year=Integer.parseInt(enrollno.substring(0,2));
	int enroll_college_code=Integer.parseInt(enrollno.substring(2,5));
	int enroll_sd=Integer.parseInt(enrollno.substring(5,7));
	int enroll_comp=Integer.parseInt(enrollno.substring(7,9));
	int enroll_series=Integer.parseInt(enrollno.substring(9,12));
	String errorMessage="";
	if(enroll_year>19 && enroll_year<15)
	{
		errorMessage+="year must be in 17 to 19";
	}
	if(enroll_college_code!=47)
	{
		errorMessage+="enroll college code must be 047";
	}
	if(enroll_sd!=01 && enroll_sd!=31)
	{
		errorMessage+="enter 01 if your science student or 31\n";
	}
	if(enroll_comp !=07)
	{
		errorMessage+="enter proper code for college";
	}
	if(enroll_series<000 || enroll_series>070)
	{
		errorMessage+="enter your proper series";
	}
	if(errorMessage.length()>0)
	{
		System.out.println(errorMessage);
	}
	else
		System.out.println("valid");
	}
}