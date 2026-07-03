package i_basics.ii_basic_arrays;

/**
 * SumOfArrayElements
 * tc -> o(n) 
 */
public class SumOfArrayElements {

    public static void main(String[] args) {
        int [] arr = {0,3,5,2,7};
        System.out.println(sumOfAllElements(arr, arr.length));
    }

    public static int sumOfAllElements(int[] arr, int n ) {
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}