package i_basics.i_basic_maths;

/**
 * PerfectNumber
 * Leetcode 507. Perfect Number
 */
public class PerfectNumber {

    public static void main(String[] args) {
        int n = 496;
        System.out.println(perfectNumberV1(n));
        System.out.println(perfectNumberV2(n));
    }


    // tc -> o(n) sc > o(1)
    public static boolean perfectNumberV1(int x) {

        int result = 0;
        for(int i = 1; i < x; i++) {
            if (x % i == 0) {
                result += i;
            }
        }
        System.out.println(result);
        return result == x;
    }

    // tc -> o(sqrt(n)) sc > o(1)
    public static boolean perfectNumberV2(int x) {
        int result = 1;
        for(int i = 2; i * i <= x; i++ ) {
            if (x % i == 0) {
                result += i;
                if (i != x/i) {
                    result += x/i;
                }
            }
        }
        return result == x;
    }
}