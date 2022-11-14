//print right code when 5,7,11,24 or wrong choice when invalid//
import java.util.*;
public class q29 {
    public static void main(String[] args) {
        System.out.println("enter the code");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        if((a==5)||(a==7)||(a==11)||(a==24))
    System.out.println("right code");
    else
    System.out.println("wrong choice");
  }
    
}
