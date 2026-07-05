package vi_arrays;
import static i_basics.ii_basic_arrays.MyArrayUtils.printArray;

/**
 * LeftRotateArrayByOne
 * TC -> O(n)
 */
public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9};
        printArray(arr);
        leftRotateArrayByOne(arr);
        printArray(arr);
    }

    public static void leftRotateArrayByOne(int[] nums) {

        int temp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;
    }
}