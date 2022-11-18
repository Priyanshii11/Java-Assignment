//print square and cube of number
import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        System.out.println("enter any integer");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("square of int = " +(a*a) );
        System.out.println("cube of integer = "+(a*a*a));
    }
}