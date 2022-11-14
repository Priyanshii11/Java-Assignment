import java.util.*;
public class if1 {
    public static void main(String args[]) 
    
    { System.out.println("enter the age");

        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        //System.out.println("enter the nationality");
        String b="Indian";
        //System.out.println("nationality " +b);
        if (a>=18)
        {
        if(b=="Indian")
        System.out.println("you can vote");
        else
        System.out.println("you have enter wrong nationality");
        }
       // else
       // System.out.println("you are underage");
    }
} 


