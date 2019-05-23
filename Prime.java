import java.util.*;
public class Prime
{  
    public static void main(String args[])
    { 
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int flag=0; 
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
               flag++; 
            }
        }
        if(flag==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }  
} 
