package MyPack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int [] Narray= {23,12,34,45,65};
		String [] Sarray= {"Bus","Apple","cat","girl","dog"};
		System.out.println("Original numeric array: " +Arrays.toString(Narray));
		Arrays.sort(Narray);
		System.out.println("Sorted numeric array: " +Arrays.toString(Narray));
		
		System.out.println("Original String array: " +Arrays.toString(Sarray));
		Arrays.sort(Sarray);
		System.out.println("Sorted String array: " +Arrays.toString(Sarray));
		
		
	}

}
