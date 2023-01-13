//Q24 - Write a program which enter any integer and if it is less than 5 than calculate its cube
//otherwise calculate and print its square.
import java.util.*;
public class q24 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner pri=new Scanner(System.in);
        float a=pri.nextFloat();
        if(a<=5)
        System.out.println("cube of " +a+ " is " +(a*a*a));
        else
        System.out.println("square of " +a+ " is " +(a*a));
    
   
   
    }
    
}
