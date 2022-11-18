/* which enter age of a person if the age is 18 or more then print you are adult otherwise
 print you are minor using Conditional operator [? :] */
import java.util.*;
public class q36 {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        int i;
        i=(a>=18)?1:0;
        if(i==1)
        System.out.println("adult");
        else
        System.out.println("minor");

    }
    
}
