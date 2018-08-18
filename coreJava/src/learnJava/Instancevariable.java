package learnJava;

public class Instancevariable {
	
	int a =10;
	int b=20;
	 
	void m1()
	{
		System.out.println("Instance variable m1 method");
		System.out.println(a);
		System.out.println(b);
		
		
	}

	public static void main(String[] args) {
		Instancevariable i=new Instancevariable();
		i.m1();


	}

}
