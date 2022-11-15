import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        System.out.println("enter the integers");
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println();
        System.out.println("enter two integer is " +a+ " and " +b);
        System.out.println(+a+ " + " +b+ " = " +(a+b));
        System.out.println(+a+ " - " +b+ " = " +(a-b));
        System.out.println(+a+ " * " +b+ " = " +(a*b));
        System.out.println(+a+ " / " +b+ " = " +(a/b));
        System.out.println(+a+ " % " +b+ " = " +(a%b));
    }
}
