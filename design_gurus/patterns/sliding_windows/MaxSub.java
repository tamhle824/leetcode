import java.util.*;


public class MaxSub {

    public static int getMax(int k, int[] arr){
        int windowSum = 0, maxSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0;windowEnd < arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            if (windowEnd >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }

    



    public static void main(String[] args){
        System.out.println(getMax(2,new int[] {2,3,3,1}));
    }
}
