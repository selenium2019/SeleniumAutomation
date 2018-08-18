package learnJava;

public class Example1 
{
     int a=19;
     int b=20;
     static void m1()
     {  Example1 e=new Example1();
    	System.out.println(e.a);
        System.out.println(e.b);
     }  
      static void m2()
     {   Example1 e1=new Example1();
    	 System.out.println(e1.a);
         System.out.println(e1.b);
     }
         public static void main(String[] args)
    	 {
    	Example1.m1();
    	Example1.m2();
    	
     }
    	 }
