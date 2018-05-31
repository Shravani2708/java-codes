package MyPack;

public class reverseArray1 {
	
	static  void ReverseArray(int arr[],int start, int end)
	 {
		 int temp;
		 if(start>=end)
			 return;
		 temp=arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
		 ReverseArray(arr,start+1,end-1);
	 }
	 
	 static void printarray(int arr[],int size)
	 {
		 for(int i=0;i<size;i++)
			 System.out.println(arr[i] + "");
		
	 }

	public static void main(String[] args) {
	int arr[]= {2,5,7,9,8};
	printarray(arr,5);
	ReverseArray(arr,0,4);
	System.out.println("Reverse array is : ");
	printarray(arr,5);
	
	

	}

}
