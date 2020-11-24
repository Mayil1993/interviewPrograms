package com.mayil.spring.programs;

public class StringRotateByTwoPlaces {

	public static void main(String[] args) {
		
		String s1="amazon";
		String s2="azonam";
		
		isRotated(s1,s2);
        }
	
	
	public static boolean isRotated(String s1, String s2){
		
		if(s1.length() <= 0 ||  s2.length() <= 0){
            return false;
        }else if ((s1.length()==1 && s2.length()==1) || (s1.length()==2 && s2.length()==2)){
            return s2.equals(s1);
        }else{
            return s2.substring(2)
                 .concat(new StringBuilder(s2.substring(0, 2))
                 .toString()).equals(s1) || 
                 s1.substring(2)
                 .concat(new StringBuilder(s1.substring(0, 2))
                 .toString()).equals(s2);
	}
}

}