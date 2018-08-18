package strings;

import java.util.ArrayList;

public class string {
	
	
	public static void main(String[] args) {
		//1
		String s="gnani";
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(1));
		s+="Gnanesh";
		System.out.println(s);
		s=s+" Madhuri";
		System.out.println(s);
		s=s.concat(" Love you so much");
		System.out.println(s);
		
		//2
		String s1="   Gnanesh";
		System.out.println(s1.equalsIgnoreCase("gnanesh"));
		System.out.println(s1.equalsIgnoreCase("Gnanesh"));
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		System.out.println(s1.toLowerCase());
		//System.out.println(s1.replaceFirst(G, M));
		//System.out.println(s1.lastIndexOf(e));
		//System.out.println(s1.IndexOf(e));
		System.out.println(s1.trim());
		
		String s2="gnanesh";
        //length()
		System.out.println(s.length());
		//length
		int[] a=new int[] {1,2,3,4,5};
		System.out.println(a.length);
		//size()
		//ArrayList a=new ArrayList();
		//a.add(10);
		//a.add(20);
		//System.out.println(a.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
