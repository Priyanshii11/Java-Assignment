/*Q38 - WAP which enter the age sale made by any person if the sale is upto 2500 then commission is 
5% of sale otherwise it is 7% of sale using Conditional operator[? :] */
import java.util.*;
public class q38 {
    public static void main(String[] args) {
        System.out.println("enter the sales");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        String i;
        i=(a<=2500)?"5% of sale":"7% of sale";
        System.out.println("sale" +i);
       
    }
    
}

