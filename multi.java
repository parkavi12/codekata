import java.util.*;
public class multi
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=5;i++)
		{
			System.out.print(i*n);
			if(i<=4)
			{
			    System.out.print(" ");
			}
		}  
		input.close();
	}
}
