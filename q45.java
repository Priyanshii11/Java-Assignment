//wap to calucalte income tax to the gov//
import java.util.*;
public class q45 {
    public static void main(String[] args) {
        System.out.println("enter the income emlpoyee in lakhs");
        Scanner pri=new Scanner(System.in);
        long a=pri.nextInt();
        float tax;
        if(a<250000)
        System.out.println("not valid,income is not less than 2.5L ");
        else if (a<=250000 && a<500000)
        {
        tax = a*0.5f;
        System.out.println("tax is 5% " +tax );
        }
        else if (a<=500000 && a<1000000)
        {
        tax = a*0.2f;
        System.out.println("tax is 20% "+tax);
        }
        else
        {
        tax=a*0.3f;
        System.out.println("tax is 30%" +tax);
        }
    
     }
    
}

