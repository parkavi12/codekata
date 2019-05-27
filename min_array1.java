import java.util.*;
public class min_array
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{ 
		    arr[i]=input.nextInt();
		}  
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
		 if(max>arr[i])
		 {
		     max=arr[i];
		 }
		}
		System.out.println(max);
		input.close();
	}
}
