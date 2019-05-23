import java.util.*;
public class oddIntervel
{  
    public static void main(String args[])
    { 
        Scanner input =new Scanner(System.in);
        int s=input.nextInt();
        int e=input.nextInt();
        List<Integer>result=new ArrayList<Integer>();
        for(int i=s+1;i<e;i++)
        {
            if(i%2!=0)
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
