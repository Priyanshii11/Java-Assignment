//which enter sales made by a any salesman that calculate and print the commission, according to following rules -
//sale up to 25000, commission is 5% of sale, otherwise it is & 7% of sales
import java.util.*;
public class q25{
 public static void main(String[] args) {
    System.out.println("enter th sale in rupees");
    Scanner pri=new Scanner(System.in);
   int a=pri.nextInt();
   if(a<=25000)
   {
      float cm1=(a*5)/100f;
   System.out.println("5% sale");
   System.out.println("comission= " +cm1);
   }
   else if(a>25000){
      float cm2=(a*7)/100f;
      System.out.println("7% sale");
   System.out.println("comission=" +cm2);
   }
 }
}