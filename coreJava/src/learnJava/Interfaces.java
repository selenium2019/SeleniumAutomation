package learnJava;

interface calc
{
	void add();
	void sub();
	void mul();
}

abstract class Interfaces implements calc
{
       public void add()
        {
	         System.out.println("enter 2 no for sum");
               }
        public void sub()
        {
         	System.out.println("enter 2 no for sub");
          }
}
class Interfacesss extends Interfaces
{
	public void mul()
	{
		System.out.println("enter 2 no for mul");
	}
	
	public static void main (String[] args) 
	{
		
		Interfacesss i = new Interfacesss();
		i.add();
		i.sub();
		i.mul();
	}
}



