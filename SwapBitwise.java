import java.util.*;
public class SwapBitwise
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
		System.out.print(num1+" "+num2);		
	}
}
