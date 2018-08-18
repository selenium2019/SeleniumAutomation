package learnJava;

public class Example2 {
	
	int a=19;
	int b=20;
	static int c=1920;
	static int d=2019;
	  void m1()
	  {
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(Example2.c);
		  System.out.println(Example2.d);
	  }
	  static void m2()
	  {
		Example2 e2=new Example2();
		  System.out.println(e2.a);
		  System.out.println(e2.b);
		  System.out.println(Example2.c);
		  System.out.println(Example2.d);
	    }
	public static void main(String[] args) {
		Example2 e3=new Example2();
		e3.m1();
		Example2.m2();
		

	}

}
