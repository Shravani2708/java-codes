package MyPack;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		char ch ='i';
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		ch=sc.next().charAt(0);
	
		if (ch=='a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
			System.out.println(ch + "is vowel");
		}
		else
		{
          System.out.println(ch + "is consonant");
		}

	}

}
