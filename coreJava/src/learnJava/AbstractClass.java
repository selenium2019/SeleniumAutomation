package learnJava;


abstract class AbstractClass {

	  public void camera()
	  {
		  System.out.println("hi camera opened choose front or back camera");
	  }
	  public void frontcamera()
	  {
		  System.out.println("hi front camera opened take a pic,if u want back camera wait for implementation it is under process");
	  }
	  
	  abstract void backcamera();
  }

  class updatedmobile extends AbstractClass
  {
	  public void backcamera()
	  {
		  System.out.println("hi backcamera updated ,now u can take a pic ,so its working now ");
	  }
  
   public static void main(String[] args)
   {
		updatedmobile u=new updatedmobile();
		u.camera();
		
		u.frontcamera();
		u.backcamera();
	}

   }



