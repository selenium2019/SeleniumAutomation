package learnJava;

class Contains
{
	int a=10;
	static int z=258;
	static int b=20;
	void m2()
	{  
		System.out.println(a);
		System.out.println(b);
	}
	static int m4(int z)
	{
        System.out.println("...");
		return z;
	}
	int m5(int z)
	{
        System.out.println("...");
		return this.z;

	}
	void m1()
	{
		int c=30;
		System.out.println(c);
		}
	Contains()
	{   
		this("madhu");
		//System.out.println("iam a constructor with 0 arg");
		int d=40;
		System.out.println(d);
	}
	Contains(char ch)
	{  // System.out.println("iam a constructor with 1 arg");
		int a=1920;
		System.out.println(a);
		}
	void m3()
	{
		this.a=a;
		System.out.println(a);
		}
		Contains(String str)
	{
		int x=33;
		int y=44;
		System.out.println(x+y);
	}
	{
		//System.out.println("iam instance block");
		int a=9999;
			System.out.println(a);
	}
	static
	{   //System.out.println("this is static block");
		int b=888;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Contains c=new Contains();
		Contains c1=new Contains("gnanesh");
		Contains c2=new Contains('p');
		c.m1();
		c.m2();
		c.m3();
		int u=Contains.m4(66);
		int v=c.m5(77);
		System.out.println("the returned value of m4() is=="+u);
		System.out.println("the returned value of m5() is=="+v);
		System.out.println("This is an example of class which contains variables,methods,constructors,Instance block,static block");
	}
}
