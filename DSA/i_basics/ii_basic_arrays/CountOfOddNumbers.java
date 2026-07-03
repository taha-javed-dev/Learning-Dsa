package i_basics.ii_basic_arrays;

/**
 * CountOfOddNumbers
 * tc O(n)
 */
public class CountOfOddNumbers {

    public static void main(String[] args) {
        int [] arr = {0,3,5,2,7};
        System.out.println(countOddInArray(arr, arr.length));
    }


    public static int countOddInArray(int[] arr, int n ) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}