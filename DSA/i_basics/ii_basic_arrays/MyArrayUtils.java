package i_basics.ii_basic_arrays;

public class MyArrayUtils {
    public static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i+1 +" : "+arr[i]);
        }
        System.out.println();
    }
}
