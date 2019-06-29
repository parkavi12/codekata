import java.util.*;
public class Paru
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		// int n=input.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=input.nextInt();
		}	
		Arrays.sort(arr);
			System.out.println(arr[9]);
		
	}
}
