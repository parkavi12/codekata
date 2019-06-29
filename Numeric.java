import java.util.*;
public class Numeric {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        String string = input.next();
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
