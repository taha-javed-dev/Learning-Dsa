package i_basics.i_basic_maths;

// GFG Count Digits in a Number
// TC -> O( log10 number) or O(NumberOfDigits) SC -> O(1)
public class CountDigitsInNumber {
    public static void main(String[] args) {
        int n = 1241;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int x ) {
        int count = 0;
        while (0 < x) {
            x = x / 10;
            count++;
        }
        return count;
    }
}
