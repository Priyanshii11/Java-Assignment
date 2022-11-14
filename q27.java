//check the number is positive or negative or zero
import java.util.*;
public class q27
 {
    public static void main(String[] args) {
        System.out.println("enter the integer");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        if(a>0)
        System.out.println(+a+" is a positive number");
        else if(a==0)
        System.out.println(+a+" number is zero");
        else
        System.out.println(+a+" is a negative number");

    }

}
