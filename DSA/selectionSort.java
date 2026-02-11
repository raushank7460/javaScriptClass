package DSA;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of Array:");
        int len=sc.nextInt();
        System.out.println("Enter the ele :");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        selectionSorts(arr, len);
    }
    public static void selectionSorts(int[]arr,int len){
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        System.out.println("There is Output:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
}

 