package Week2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int n=sc.nextInt();
        System.out.println(findNthNumber(n));
    }
    
    public static long findNthNumber(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        long a=0;
        long b=1;
        long c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;


        }
        return b;

    }
    
    
}
