package i_basics.i_basic_maths;

/**
 * GCDOfOddEvenSum
 * Leetcode 3658. GCD of Odd and Even Sums
 * TC -> O( n + log n) SC -> 1
 */
public class GCDOfOddEvenSum {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }

    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= n; i++) {
            sumOdd += 2 * i - 1;
            sumEven += 2 * i;
        }
        return findGCD(sumOdd, sumEven);
    }

     public static int findGCD(int x, int y) {
        while( x != 0 && y != 0) {
            if(x > y) {
                x = x % y;
            }
            else {
                y = y % x;
            }
        }
        if( x == 0 ) return y;
        return x;
    }
}