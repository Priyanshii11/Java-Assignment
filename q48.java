/*Write a program to find out the type of website from the URL:
.com – commercial website
.org – organization website
.in – Indian website*/
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