//Write a program which enter the age of a person and if the age is 18 or more, than print you are adult otherwise print you are minor
import java.util.*;
public class q21 {
    
    public static void main(String args[]) 
    {
        Scanner pri =new Scanner(System.in);
        int a=pri.nextInt();
        if (a>=18)
        System.out.println("you can vote");
        else
        System.out.println("you are underage");
    }
} 
