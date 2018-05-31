package MyPack;

public class compareArray {
	static void printarray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}



	public static void main(String[] args) {
		int[] oldarray= {1,2,3,4,5};
		int[] oldarray1= {1,2,3,4,5,6};
		if(oldarray.length>oldarray1.length)
		{
			
			printarray(oldarray);
		}
		else
		{
			printarray(oldarray1);
		}
	}
}


	  
	  
	  
