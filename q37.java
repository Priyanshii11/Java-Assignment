 /*WAP which enter any integer then check and print, whether it is odd no. or even no.
 using Conditional operator[? :] */
 import java.util.*;
public class q37 {
    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        int i;
        i=(a%2==0)?1:0;
        if(i==1)
        System.out.println("even");
        else
        System.out.println("odd");

    }
    
}

