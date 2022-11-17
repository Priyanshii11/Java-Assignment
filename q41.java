//Q41 - WAP which force the user to enter any positive value and print it. the program should keep on asking the no. again until the user do not enter any negative number.

import java.util.*;
public class q41 
{
    public static void main(String[] args) 
    {
        int a;
        do
        {
        System.out.println("enter any positive number ");
        Scanner pri=new Scanner(System.in);
        a=pri.nextInt();
        }
        while(a>0);
        System.out.println("loop break");
    }
}

