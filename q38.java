import java.util.*;
public class q38 {
    public static void main(String[] args) {
        System.out.println("enter the sales");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        String i;
        i=(a<=2500)?"5% of sale":"7% of sale";
        System.out.println("sale" +i);
       
    }
    
}

