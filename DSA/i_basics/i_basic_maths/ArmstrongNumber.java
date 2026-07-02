package i_basics.i_basic_maths;
import static i_basics.i_basic_maths.CountDigitsInNumber.countDigits;
/**
 * ArmstrongNumber
 * Leetcode 1134. Armstrong Number
 * O(d+d)  d(n of digits) = log10(n) + 1
 * TC -> O(d) SP -> O(1)
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int x) {
        int temp = x;
        int result = 0;
        int numberOfDigits = countDigits(x); 
        while (0 < temp ) {
            int lastDigt = temp % 10;
            result = result + (int) Math.pow(lastDigt, numberOfDigits); 
            temp = temp / 10;
        }
        return result == x;
    }
}