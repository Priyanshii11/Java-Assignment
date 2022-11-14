//wap to calucalte income tax to the gov//
import java.util.*;
public class q45 {
    public static void main(String[] args) {
        System.out.println("enter the income emlpoyee in lakhs");
        Scanner pri=new Scanner(System.in);
        long a=pri.nextInt();
        float tax,tax1,tax2;
        if(a<250000)
        System.out.println("not valid,income is not less than 2.5L ");
        else if (a<=250000 && a<500000)
        tax = a*(5/100);
        System.out.println("tax is " +tax);
        else if (a<=500000 && a<1000000)
        tax1=a*(20/100);
        System.out.println("tax is "+tax1);
        else (a>=1000000)
        tax2=a*(30/100);
        System.out.println("tax is "+tax2);
        
     }
    
}
