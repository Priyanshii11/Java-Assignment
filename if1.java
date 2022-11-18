//
import java.util.*;
public class if1 {
    public static void main(String args[]) 
    { 
        System.out.println("enter the age");

        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        String b;
        if (a>=18)
        {
        //System.out.println("enter the nationality");
        //=pri.next();
        //if (b=='Indian' || b=='indian')
        System.out.println("you can vote");
        //else
        //System.out.println("you have enter wrong nationality");
        }
        else
        System.out.println("you are underage");
    }
} 


