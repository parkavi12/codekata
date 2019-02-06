import java.io.*;
import java.util.Scanner;
class LeapYear {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        if(year % 4 == 0)
        {
            System.out.println( "yes"); 
        }
        else
            {
                 System.out.println( "no");
            }
    }
}
