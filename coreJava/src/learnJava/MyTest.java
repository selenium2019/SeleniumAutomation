package learnJava;


//by using multithreading we can make a parallel execution 


class MyThread extends Thread
{
	public void run()
	{	
	for(int i=1;i<=10;i++)
	{
	System.out.println("The square of "+i+"is:"+i*i);
	
	try
	{
		Thread.sleep(3000);
		}
	catch(Exception e)
	{
	}
}
}
public static class MyTest {

	public static void main(String[] args) throws Exception 
	{
	MyThread t=new MyThread();
	t.start();
	 
	for(int i=1;i<=10;i++)
	{
		System.out.println("The cube of "+i+"is :"+i*i*i);
		Thread.sleep(3000);
	}
	}
}
}

