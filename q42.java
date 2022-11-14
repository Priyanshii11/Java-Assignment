//to read gender m/f and print right code otherwise not valid//
import java.util.*;
public class q42
{
    public static void main(String[] args) 
    {
        System.out.println("enter the code f/m");
        Scanner pri=new Scanner(System.in);
        char a=pri.next().charAt(0);
    
        switch(a)
        {
            case 'm':
            case 'M':
            System.out.println("you are male");
            break;
            case 'f':
            case 'F':
            System.out.println("you are female");
            break;
            default:
            System.out.println("not valid");
        }
        
    }
    
}
