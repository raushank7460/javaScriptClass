package Week2;

import java.util.Scanner;

public class primeAndPowerOfAPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            solve(n);
        }
    }

    public static void solve(int n){
        if(n==1){
            System.out.println(0);
            return;
        }
        if(isPrime(n)|| isPrimePower( n)){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static boolean isPrimePower(int n){
        for(int j=2;j*j<n;j++){
            if(isPrime(n)){
                long power=j;
                while (power<n) {
                    power*=j;
                    
                }
                if(power==n) return true;
            }

        }
        return false;
    }
    
}


