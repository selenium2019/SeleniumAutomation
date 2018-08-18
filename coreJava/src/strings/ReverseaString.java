package strings;

public class ReverseaString {
public static void main(String[] args)
	
	{
		String s ="abcdef";
		
		int len=s.length();
		System.out.println(len);
		String reverse ="";
		
		//1.we can use for loop
		
		for(int i=len-1;i>=0;i--) 
		{
           reverse = reverse +s.charAt(i);
           
           // printing in for loop order
          System.out.println(reverse);
           
		}
		//printing the rev string out side for loop
		System.out.println(reverse);
		//2.we can use string buffer to reverse.
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
		
		//3.by array
		char[] chars=s.toCharArray();
		String reverse1="";
		for(int i=chars.length-1;i>=0;i--)
		{
			reverse1=reverse1+chars[i];
		}
		System.out.println(reverse1);
		
		if(s.equals(reverse1))
		{
			System.out.println("the string is a palindrome");
		}	
		else
		{		
     		System.out.println("the string is not a palindrome");
	}
		}
}
	

