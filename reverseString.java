package MyPack;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner inputString=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=inputString.next();
		inputString.close();
		String revString="";
		
	    char[] ch=str.toCharArray();
	    
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	revString = revString+ch[i];
	    	
	    }
	    System.out.println(revString);
	    
	}

}
