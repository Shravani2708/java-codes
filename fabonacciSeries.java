package MyPack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class fabonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1;
		while(a<=200)
		{
		 System.out.println(a);
		 System.out.println(b);
		 b=a+b;
		 b=a;
		 a=b-a;
		 
		}
			
	}

}
