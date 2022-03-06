import java.util.*;



public class Average {
    
    public static double[] findAvg(int K, int[] arr){

        double[] results = new double[arr.length - K +1];
        double sum = 0;
        int counter = 0;

        for(int i = 0; i < arr.length;i++){
            sum += arr[i];

            if(i >= K - 1){
                results[counter] = sum/K;
                sum -= arr[counter];
                counter++;
            }
        }
        return results;
    }
    




    public static void main(String[] args){
       System.out.println(Arrays.toString(findAvg(5,new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 })));

    }
}
