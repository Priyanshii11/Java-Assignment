// wap to enter a code m for male f for female and check whether enter code is male or female or not a valid entry//
import java.util.Scanner;
public class q28 {
    public static void main(String[] args) {
        System.out.println("enter the code whether you are male or female");
        Scanner pri=new Scanner(System.in);
        char a=pri.next().charAt(0);
        if ((a=='M')||(a=='m'))
        System.out.println("user is male");
        else if ((a=='F') || (a=='f'))
        System.out.println("user is female");
        else 
        System.out.println("you have enter a wrong choice");
    }
    
}
