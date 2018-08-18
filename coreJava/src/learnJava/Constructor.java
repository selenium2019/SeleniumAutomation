package learnJava;

public class Constructor {
         Constructor(){
        	 this(10);
        	 System.out.println("0 arg cont");
        	 
        	 
         }
         Constructor(int a){
        	 this(10,20);
        	 System.out.println("1 arg cont");
        	 
         }
         Constructor(int a,int b){
        	 System.out.println("2 arg cont");
        	 
         }
	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor c1=new Constructor(10);
		Constructor c2=new Constructor(10,20);

	}

}
