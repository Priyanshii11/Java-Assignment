//Write a program which enter any character and print its ACSII value.
import java.util.*;

public class q34 {
    public static void main(String[] args) {
        System.out.println("enter character");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.println("character `" +(int)a);
    }
    
}
