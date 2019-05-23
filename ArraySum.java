 
import java.util.*;
 public class ArraySum
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    int k=input.nextInt();
	    int array[]=new int[n];
	    int sum=0;
	    for (int i=0;i<n;i++)
	    {
	        array[i]=input.nextInt();
	    }
	    for(int i=0;i<k;i++)
	    {
	        sum=sum+array[i];
	    }
	        System.out.print(sum);
	    }
}
