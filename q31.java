/*- WAP which enter Annual family income and age of a person and if the income is from 1 lakh to 
2 lakh and age is also from 18 to 24 then print eligible for scholarship otherwise print not eligible for 
scholarship*/
import java.util.Scanner;
public class q31
 {
    public static void main(String[] args) 
    {
        System.out.println("enter the family income in lakhs");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        System.out.println("enter the age");
        int b=pri.nextInt();
        if ((a>=100000)&&(a<=200000))
        {

            if ((b>=18)&&(b<=24))
            System.out.println("you are eligible for schlorship");
            else 
            System.out.println("age is not valid");
        }
        else 
        System.out.println("you are not eligible");
        }
    }   

