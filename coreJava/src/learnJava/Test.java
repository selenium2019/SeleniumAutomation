package learnJava;

class Test
{
int a=10;
static int b=20;

public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=100;
		t.b=200;
        System.out.println(t.a);
		System.out.println(t.b);
		Test t1=new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);
		Test t2=new Test();
		t2.a=2000;
		System.out.println(t2.a);
		System.out.println(t2.b);

	}
}
