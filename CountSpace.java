import java.util.*;
public class CountSpace
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String sen=input.nextLine();
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			if(Character.isWhitespace(sen.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);		
	}
}
