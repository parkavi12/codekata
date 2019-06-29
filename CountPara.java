import java.util.*;
public class CountPara
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String sen=input.nextLine();
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)=='.')
			{
				count++;
			}
		}
		System.out.println(count+1);		
	}
}
