package MyPack;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number :  ");
		num1=sc.nextDouble();
		System.out.println("Enter a second number :  ");
		num2=sc.nextDouble();
		
		System.out.println("Enter an operator (+ , - , * , /):  ");
		char operator=sc.next().charAt(0);
		
		sc.close();
		double output;
		
		switch(operator)
		{
			case '+':
		          output= num1+num2;
		           break;
		           
		   case '-':
		           output=num1-num2;
		           break;
		           
		   case '*':
		          output= num1*num2;
		           break;
		           
		   case '/':
		          output= num1/num2;
		           break;
		           
		    default:
		    	System.out.print("wrong operator entered");
		    	return;
		}
		
		System.out.println(num1+ "" +operator+"" +num2+":" +output);
				
		
	}

}
