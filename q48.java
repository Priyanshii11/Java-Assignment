//Q42 - Number is series 1 1 2 3 5 8 13.....(Fibonacci series). WAP which enter the number of term and that many term of series should be generated and print it.
import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        System.out.println("enter the website");
        Scanner pri=new Scanner(System.in);
        String website = pri.next();
        if(website.endsWith(".org"))
        {
         System.out.println("this organsization website");
        }
        else if (website.endsWith(".com"))
        {
            System.out.println("this is commercial wwebsite");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("indian website");
        }
    }
}