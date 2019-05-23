import java.util.*;
public class Main
{  
    static boolean Armstrong(int n)
    {
        int c=0,a,temp;  
        temp=n;  
        while(n>0)  
        {  
            a=n%10;  
            n=n/10;  
            c=c+(a*a*a);  
        }  
        if(temp==c) 
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
        List<Integer> result=new ArrayList<Integer>();
        for(int i=s+1;i<e;i++)
        {
        if(Armstrong(i))
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
} }
