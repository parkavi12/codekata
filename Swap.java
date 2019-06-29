import java.util.*;
public class Swap
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int temp=m;
		m=n;
		n=temp;
		System.out.print(n+" "+m);		
	}
}
