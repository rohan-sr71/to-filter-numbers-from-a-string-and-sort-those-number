import java.util.*;
class xyz
{                    
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		ArrayList<Object> al=new ArrayList<Object>();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='-')
			{
			al.add('-');	
			}
			if(Character.isDigit(str.charAt(i)))
			{
				int x=Character.getNumericValue(str.charAt(i));
				al.add(x);
				if(!Character.isDigit(str.charAt(i+1)))
				{
					al.add('#');
				}
			}
		}
		if(Character.isDigit(str.charAt(str.length()-1)))
		{
			int x=(str.charAt(str.length()-1));
			al.add(x);
		}
		String str1="";
		for(int i=0;i<al.size();i++)
		{
			str1=str1+al.get(i);
		}
		String ch1[]=str1.split("#");
		
		int ar[]=new int[ch1.length];
		for(int i=0;i<ch1.length;i++)
		{
			ar[i]=Integer.parseInt(ch1[i]);
		}
		
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
		
