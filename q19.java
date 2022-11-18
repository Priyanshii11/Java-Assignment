//calculate simple interest
import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d;
        System.out.println("enter the principle");
        a=sc.nextFloat();
        System.out.println("enter rate");
        b=sc.nextFloat();
        System.out.println("enter time");
        c=sc.nextFloat();
        d=(a*b*c)/100;
        System.out.println("simple interest = "+d);
    }
    
}
