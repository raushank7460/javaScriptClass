package Week2;

import java.util.HashMap;
import java.util.Scanner;

public class longestSubList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int result=longestSubarray(arr, n, k);
            System.out.println(result);
            
        }
    }
    public static int longestSubarray(int[]arr,int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=i+1;
        
            }
            if(map.containsKey(sum-k)){
                maxlen=Math.max(maxlen, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxlen;


        
    }
    
}
