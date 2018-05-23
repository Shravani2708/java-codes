package MyPack;

public class patternRhombus {

	public static void main(String[] args) {
		int spaces,j,i;
		for(i=1;i<=4;i++)
		{
			for(spaces=4-i;spaces>0;spaces--)
				System.out.print(' ');
			for(j=2*i-1;j>0;j--)
				System.out.print("x");
			System.out.println();
		}
		for(i=3;i>=0;i--)
		{
			for(spaces=0;spaces<4-i;spaces++)
				System.out.print(' ');
			for(j=0;j<2*i-1;j++)
				System.out.print("x");
			System.out.println();
		}

	}

}
