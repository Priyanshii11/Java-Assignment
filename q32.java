import java.util.*;
public class q32 {
    public static void main(String[] args) {
        System.out.println("enter the marks of three subjects ");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat(); 
        float avg=(a+b+c)/3f;
        if(avg>=60)
        System.out.println("first division");
        else if(avg>=45 && avg<60)
        System.out.println("second div");
        else if(avg>=33 && avg<45)
        System.out.println("third div");
        else 
        System.out.println("fail");
    
}

    
}
