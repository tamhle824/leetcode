import java.util.*;


public class SmallestSub {
    
    public static int getMin(int S, int[] arr){
        
        int min = Integer.MAX_VALUE;
        int count = 0;
        int K = arr.length;
        int sum = 0;

        for(int i = 0; i< arr.length;i++){

            sum+= arr[i];

            while(sum >= S){
                min = Math.min(min,i-count+1);
                sum-=arr[count];
                count++;
            }
        }





        return min == Integer.MAX_VALUE ? 0 : min;
    }


    public static void main(String[] args){
        System.out.println(getMin(8,new int[] {3,4,1,1,6}));
    }
}
