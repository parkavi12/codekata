 
import java.util.*;
 public class Power
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int num1=input.nextInt();
	    int num2=input.nextInt();
	    int power=1; 
            for(int i=0;i<num2;i++)
            {
                power=power*num1;
            }
	        System.out.print(power);
	    }
}
