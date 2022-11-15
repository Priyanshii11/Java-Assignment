import java.util.Scanner;

public class q42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0 ,j=1;
        System.out.println("fibonacci series " +a+ "terms");
        for (i=1;i<=a;++i)  { 
        int c = i+j;
        i=j;
        j=c;
        System.out.println( +i);
        }

    }
    
}
