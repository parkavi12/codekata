import java.util.*;
public class primeIntervel
{  
    static boolean isprime(int num)
    {
        int flag=0;
         for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag++;  
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    { 
        Scanner input =new Scanner(System.in);
        int s=input.nextInt();
        int e=input.nextInt();
        List<Integer>result=new ArrayList<Integer>();
        for(int i=s+1;i<e;i++)
        {
            if(isprime(i))
            {
               result.add(i);
            }
        }
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i));
            if(i<result.size()-1)
            {
                System.out.print(" ");
            }
        }
    }  
} 
