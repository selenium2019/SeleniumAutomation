package learnJava;

public class Methods {

	void m1(int a,String str)
	//instance methods with parameters
	{
		System.out.println("Bujji");
		System.out.println(a);
		System.out.println(str);
	}
	static void m2(String str,int a)
	//static methods with parameters
	{
		System.out.println("PaPa");
		System.out.println(a);
		System.out.println(str);
	}
	public static void main(String[] args) {
		Methods m=new Methods();
		m.m1(19,"loves");
		// calling m1 method by using reference variable also passing parameters
		Methods.m2("Bujji Papa @======@ 1920",20);
		//calling m2 method by using class name also passing parameters
		
	}

	}


