//take input from user b/w 5 to 24 then print right code or print wrong/invalid code//
import java.util.*;
public class q30 {
    public static void main(String[] args) {
        System.out.println("enter the number b/w 5 to 24");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        if ((a>=5)&&(a<=24))
        System.out.println("enter the  right code");
        else
    System.out.println("wrong codee");
    }
    
}
