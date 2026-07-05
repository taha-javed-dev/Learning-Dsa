package vi_arrays;

/**
 * LinearSearch
 * TC -> O(n)
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {0,3,2,8,2,5};
        System.out.println(searchElement(arr, 8));
    }

    public static int searchElement(int[] nums, int key) {
        for(int i = 0; i < nums.length; i++) {
            if (key == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}