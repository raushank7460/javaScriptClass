package DSA;

import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("len of Array:");
        int num=sc.nextInt();
        System.out.println("enter the ele:");
        int[]arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSorts(arr, num);

    }
    public static void bubbleSorts(int[]arr, int num){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }

               
        }
        System.out.println("There is Output");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
}
