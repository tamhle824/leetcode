import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] arr = new int[2];
        for (int i = 0;i < nums.length;i++) {
            int temp = target - nums[i];
            arr[0] = i;
            for (int j = 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ar1 = {3,3};
        System.out.println(twoSum(ar1,6));
    }
}