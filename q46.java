// Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
import java.util.*;
public class q46 { 
    public static void main(String[] args) {
        System.out.println("enter the number of the weeks");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        switch (a)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thrusday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("not valid");
            break;
        }
    }

    
    
}
