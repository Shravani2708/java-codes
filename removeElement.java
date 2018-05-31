package MyPack;

import java.util.Scanner;

public class removeElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int arr[]=new int[100];
	int position,c,n;
	System.out.println("enter the number of elements in an array");
	n=sc.nextInt();
	System.out.println("enter"+n+"elements");
	for(c=0;c<n;c++)
	   arr[c]=sc.nextInt();
	System.out.println("enter the location to delete an element");
	position=sc.nextInt();
	if(position>n+1)
	{
		System.out.println("Deleteion not posssible");
	}
	else
	{
		for(c=position-1;c<n-1;c++)
			arr[c]=arr[c+1];
			
		System.out.println("The resultant array :");
		
		for( c=0;c<n-1;c++)
			System.out.println(arr[c]);
	}
	
		

	}

}
