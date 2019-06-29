import java.util.*;
public class TimeSub
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int m1=input.nextInt();
		int h1=input.nextInt();
		int m2=input.nextInt();
		int h2=input.nextInt();

			System.out.println(Math.abs(m1-m2)+" "+(Math.abs(h1-h2)));

		
	}
}
