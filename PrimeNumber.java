package MyPack;


		import java.util.Scanner;

		public class PrimeNumber {

			public static void main(String[] args) {
				int number,i,flag=0;
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter a number : ");
		   number=sc.nextInt();
		   
		   for(i=2;i<=number/2;i++)
		   {
			   if(number%i==0 )
			   {
				 flag=1;
			      break;
			   }
		   }
		       if(flag == 0)
			    {
			    	System.out.println(number+"prime number");
			    }
			    else
			    {
			    	System.out.println(number+"not prime number");
			    }
			}
			
			

		}

	


