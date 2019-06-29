import java.util.*;
public class Mid
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
		System.out.print(arr[mid]);
	}
}
