package MyPack;

public class ArraySum {

	public static void main(String[] args) {
		int [] Array= {23,12,13,14,21};
		int sum=0;
		
		for(int counter=0;counter<Array.length;counter++)
		{
			sum+=Array[counter];
		
		}
		System.out.println("the sum of array: "+sum);

	}

}
