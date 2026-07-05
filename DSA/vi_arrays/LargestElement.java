package vi_arrays;

/**
 * LargestElement
 * TC -> O(n) 
 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {0,3,2,8,2,5};
        System.out.println(findLargest(arr));
    }

    public static int findLargest(int[] nums) {
        int largest = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }
}