import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        System.out.println("enter the characters");
        Scanner sc=new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        if (a>='A' && a<='Z' )
        System.out.println("capital letter");
        else if (a>='a' && a<='z')
        System.out.println("small letter");
        else 
        System.out.println("special character or number");
    }
    
}
