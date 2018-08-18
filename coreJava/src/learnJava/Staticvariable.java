package learnJava;

public class Staticvariable {
	
	static int a =10;
	static int b=20;
		 
		void m1()
		{
			System.out.println("statice variable instance m1 method");
			System.out.println(Staticvariable.a);
			System.out.println(Staticvariable.b);
			
			
		}

		public static void main(String[] args) {
			Staticvariable s=new Staticvariable();
			s.m1();
			System.out.println(Staticvariable.a);
			System.out.println(Staticvariable.b);
			

		}

	}
