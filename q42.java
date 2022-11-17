//Q42 - Number is series 1 1 2 3 5 8 13.....(Fibonacci series). WAP which enter the number of term and that many term of series should be generated and print it.

import java.util.Scanner;

public class q42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0 , j=1, b ;
        System.out.println("fibonacci series " +a+ "terms");
        for (b=0;b<=a;++b)  { 
        int c = i+j;
        System.out.println( +c);
        i=j;
        j=c;
        
        }

    }
    
}
