package strings;

import java.util.Scanner;

public class Scannersample {
	int a;
	int b;
	
	public static void main(String[] args)
	{
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a byte");
	//String s= scanner.next();
	//int i= scanner.nextInt();
	byte b= scanner.nextByte();
	
	//CharSequence ch= scanner.next();
	System.out.println("The byte is :"+b);
	
	Scannersample ss=new Scannersample();
	ss.a=10;
	ss.b=20;
	System.out.println(ss.a);
	System.out.println(ss.b);
	
	//String s=new String(char[] ch);
	//char[] ch= {'a','b','c','d'}
	//String s=new String(ch);
	//System.out.println(s);
	}
	}
