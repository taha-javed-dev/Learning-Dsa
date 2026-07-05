package vi_arrays;

/**
 * MaximumConsecutiveOnes
 * LeetCode 485. Max Consecutive Ones
 * TC -> O(n)
 */
public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
         int[] arr = {0,1,1,1,1,0,1,1,0,1,1,1};
        System.out.println(maximumConsecutiveOnes(arr));
    }

    public static int maximumConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                count = 0;
                continue;
            }
            count++;
            if (count > ans) ans = count;
        }
        return ans;
    }
}