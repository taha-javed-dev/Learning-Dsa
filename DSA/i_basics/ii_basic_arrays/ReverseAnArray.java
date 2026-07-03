package i_basics.ii_basic_arrays;
import static i_basics.ii_basic_arrays.MyArrayUtils.*;
/**
 * ReverseAnArray
 * TC ->
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int [] arr = {0,3,5,2,7};
        printArray(arr);
        reverseArray1(arr);
        printArray(arr);
        reverseArray2(arr);
        printArray(arr);
    }
    
    // TC -> O(n)*2  SC -> O(n)
    public static void reverseArray1(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        for(int i = 0; i < n; i++) {
            temp[n - i - 1] = arr[i];
        }
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // TC -> O(n) SC -> O(1)
    public static void reverseArray2(int arr[]) {

        int l = 0;
        int r = arr.length - 1;
        while ( l < r ) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }

    
}