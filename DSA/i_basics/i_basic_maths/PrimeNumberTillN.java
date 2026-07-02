package i_basics.i_basic_maths;
import static i_basics.i_basic_maths.PrimeNumber.isPrime;
/**
 * PrimeNumberTillN
 * TC -> O( n * sqrt(n)) SC -> 1
 */
public class PrimeNumberTillN {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(countPrime(n));
    }

    static int countPrime(int n) {
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}