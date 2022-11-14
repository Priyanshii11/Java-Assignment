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
