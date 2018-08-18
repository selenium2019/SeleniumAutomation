package strings;

public class Reverseaint 
{
public static void main(String[] args)
	{
		int n=124658971,r,s=0;
		int t=n;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		s=s*10+r;
		}
		System.out.println(s);
		if(t==s)
		{
			System.out.println("This is a palindrome numnber");
		}
			else
			{
			System.out.println("This is not a palindrome numnber");
			}
	       }
	}
