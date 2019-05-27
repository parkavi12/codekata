import java.util.*;
public class Fact
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int fact=1;
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.print(fact);
		input.close();
	}
}
