package i_basics.i_basic_maths;

/**
 * PrimeNumber
 * GFG Prime Number
 * Tc -> O( sqrt(n)) sc -> O(1)
 */
public class PrimeNumber {

    public static void main(String[] args) {
        
    }


    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}