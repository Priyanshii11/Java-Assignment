//Write a Java program to find whether a year entered by the user is a leap year or not.
import java.util.*;
public class q47 {
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%4==0) && ((a%100!=0) || (a%400==0)))
        System.out.println(" it is a leap year..." +a);
        else
        System.out.println("it is not leap year" +a);
}
}




