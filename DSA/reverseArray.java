package DSA;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the len of Array:");
        int len=sc.nextInt();
        System.out.println("Enter the ele:");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
}
