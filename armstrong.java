package MyPack;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int n,temp=0,num=0,rem;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=scan.nextInt(); 
		scan.close();
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			num=num+ rem*rem*rem;
			n=n/10;
			
		}
		 if (num == temp)

		 {
			 System.out.println(  "output is true");
		 }
		 else
		 {
			 System.out.println( " output is false");
		 }
	}

}
