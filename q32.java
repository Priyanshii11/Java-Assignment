/* WAP which enter marks in three Subject of a student and calculate its average, independent 
on the average check and print the division according to following rule -
 Avg division
 60+ first
 45 -< 60 second
 33 -<45 third
 <33 fail. */
import java.util.*;
public class q32 {
    public static void main(String[] args) {
        System.out.println("enter the marks of three subjects ");
        Scanner sc=new Scanner(System.in);
        System.out.println("1st subject marks");
        float a=sc.nextFloat();
        System.out.println("2nd subject mark");
        float b=sc.nextFloat();
        System.out.println("3rd subject mark");
        float c=sc.nextFloat(); 
        float avg=(a+b+c)/3f;
        System.out.println("average " +avg);
        if(avg>=60)
        System.out.println("first division");
        else if(avg>=45 && avg<60)
        System.out.println("second division");
        else if(avg>=33 && avg<45)
        System.out.println("third division");
        else 
        System.out.println("fail");
    }

    
}
