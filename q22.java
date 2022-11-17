//Q22 - Write a program which enter marks in three subject of a student and calculate its average if the average is 33 or more than print pass otherwise print fail.
import java.util.*;
public class q22 {
    public static void main(String[] args) 
    {
        System.out.println("enter the 3 subjects");
        Scanner pri=new Scanner(System.in);
        float a=pri.nextFloat();
        float b=pri.nextFloat();
        float c=pri.nextFloat();
        float avg=(a+b+c)/3;
        if(avg>=33) 
        System.out.println("you are pass");
        else
        System.out.println("you are fail");      
    }
}
