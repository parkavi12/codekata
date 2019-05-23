import java.util.*;
public class Pali{  
 public static void main(String args[]){ 
     Scanner input =new Scanner(System.in);
  int r,sum=0,temp;    
  int n=input.nextInt();
  temp=n;    
  while(n>0)
  {    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)
    {
        System.out.println("yes");    
    }
  else
    {
       System.out.println("no");    
    }
      
  }  
} 
