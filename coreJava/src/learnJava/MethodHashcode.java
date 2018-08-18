package learnJava;

class Emp{}                //it may be present in a seperate module in the project

class X{}              //it may be present in a seperate module in the project

public class MethodHashcode {
	Emp m1()
	{
		System.out.println("m1 method");
        Emp e =new Emp();	
		return e;
	}
	X m2()
	{
		System.out.println("m2 method");
        X x  =new X();	
		return x;
	}
	static String m3()
	{
		System.out.println("m3 method");
        
		return "gnanesh";
	}

	public static void main(String[] args) {
		MethodHashcode m=new MethodHashcode();
		
		Emp e=m.m1();// calling m1 method by using object reference and 
		//holding the return value to print
		System.out.println(e);//Hashcode will print here
		
		X x=m.m2();
		System.out.println(x);//hashcode will print here
		
		String str=MethodHashcode.m3();
		System.out.println(str);// gnanesh will print here
		
	}

}
