package strings;

public class Removejunkfromstring {

	public static void main(String[] args) {
		String s="++++gnanesh*/!#$!^$gnanesh^&%&*@%selenium";
		
		//by using regular expressions we can do it,Here ^ is manditory to remove junk
		//s=s.replaceAll("[^a-zA-Z0-9]",",");
		//s=s.replaceAll("[^a-zA-Z0-9]","_");
		  s=s.replaceAll("[^a-zA-Z0-9]","");
		  //s=s.replaceAll("[a-zA-Z0-9]","");
		//s=s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s);
		
		

}
}
