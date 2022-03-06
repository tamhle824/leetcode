import java.util.*;


public class MaxSub {

    public static int getMax(int k, int[] arr){

        int max = 0;
        int counter =0;
        int sum = 0;

        for(int i = 0;i <arr.length;i++){
            sum+=arr[i];

            if(i >= k-1){
                max = Math.max(max,sum);
                sum-= arr[counter];
                counter++;

            }
        }
        return max;
    }

    



    public static void main(String[] args){
        System.out.println(getMax(2,new int[] {2,3,3,1}));
    }
}
