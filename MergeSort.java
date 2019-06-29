import java.util.*;
public class MergeSort
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}	
		Arrays.sort(arr);
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			if(i<n-1)
			{
				System.out.print(" ");
			}
		}
	}
}
