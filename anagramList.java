class anagramList
{
	public static void main(String arg[])
	{
		String str1=arg[0];
		String[] str2={"print","apple","cause","documents","file"};
		int l=str2.length;
		int j;
		for(j=0;j<l;j++)
		{
			int a[]=new int[26];
			int b[]=new int[26];
			int len=str2[j].length();
			boolean value=false;
			int i,charUnicodea,charUnicodeb;
			for(i=0;i<26;i++)
			{
				a[i]=0;
				b[i]=0;
			}
			for(i=0;i<str1.length();i++)
			{
				charUnicodea=str1.codePointAt(i);
				charUnicodea=charUnicodea-97;
				a[charUnicodea]++;
			}
			for(i=0;i<str2[j].length();i++)
			{
				charUnicodeb=str2[j].codePointAt(i);
				charUnicodeb=charUnicodeb-97;
				b[charUnicodeb]++;
			}
			for(i=0;i<26;i++)
			{
				if(a[i]!=b[i])
				break;
			}
			if(i==26)
				System.out.println("real string is " + str2[j]);
		/*else
			System.out.println("not anagram");*/
		}
	}
	}