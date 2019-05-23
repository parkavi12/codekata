import java.util.*;
public class armstrong
{  
    public static void main(String args[])
    { 
        Scanner input =new Scanner(System.in);
         int n=input.nextInt();
        int c=0,a,temp;  
    
    temp=n;   
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no"); 
    }  
} 
