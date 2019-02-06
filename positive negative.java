 import java.util.Scanner;
public class positive_negative
{
 public static void main(String[] args)
 {
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println("Input:");
  n=s.nextInt();
  System.out.println(n);
  System.out.println("Output:");
  if(n>0)
  {
   System.out.println("positive");
  }
  else if(n<0)
  {
   System.out.println("negative");
  }
  else
  {
   System.out.println("invalid");
  }
 }
}
