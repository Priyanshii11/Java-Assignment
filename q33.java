/*33 - WAP which enter sale made by any salesman than calculate and print the commission, 
according to following rules -
 Sale Commission 
 up to 25000 5% of sales
 25001 - 50000 7% of sales
50001 - 75000 8% of sales
 75001 10% of sales */
import java.util.*;

import java.util.*;
public class q33 {
 public static void main(String[] args) {
    System.out.println("enter th sale in rupees");
    Scanner pri=new Scanner(System.in);
   int a=pri.nextInt();
   if(a<=25000)
   {
      float cm1=(a*5)/100f;
   
   System.out.println("5% of sales is " +cm1);
   }
   else if(a>25000 && a<50000){
      float cm2=(a*7)/100f;
   
   System.out.println("7% of sale is " +cm2);
   }
   else if(a>50000 && a<75000)
   {
      float cm3=(a*8)/100f;
   System.out.println("8% of sale is " +cm3);
   }
   else
    {
      float cm4=(a*10)/100f;
   
   System.out.println("10% of sale is " +cm4);
 

}
 }
}
