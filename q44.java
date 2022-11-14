//wap to find out students are fail or pass, if it require a total number of 40% and atleast 33% to pass in each subjects//
import java.util.*;
public class q44 {
    public static void main(String[] args) 
    {
        System.out.println("enter marks of three subjects");
        Scanner pri=new Scanner(System.in);
        float a=pri.nextFloat();
        float b=pri.nextFloat();
        float c=pri.nextFloat();
        float total=(a+b+c); 
        System.out.println("total is " +total);
        if(total>=40)
        {
            if(a>=33 && b>=33 && c>=33)
            System.out.println("pass in all subjects");
            else 
            {
                System.out.println("fails in these subjects");
                /*if(a<=33 && b>=33 && c>=33)
                System.out.println("fails in a");
                else if(b<=33 && a>=33 && c>=33)
                System.out.println("fails in b");
                else if (c<=33 && a>=33 && b>=33)
                System.out.println("fails in c");
                else 
                System.out.println("fails in two or more subjects");*/
            }
        }
        else 
        System.out.println("fails ");
    }
}
