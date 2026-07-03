package i_basics.ii_basic_arrays;

/**
 * CheckIfArrayIsSorted
 * TC -> O(n)
 */
public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int [] arr = {3,5,4,7};
        System.out.println(isSorted(arr, arr.length));
    }


    public static boolean isSorted(int[] arr, int n ) {

        for(int i = 1; i < n; i++){
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}