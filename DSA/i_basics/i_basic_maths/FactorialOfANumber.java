package i_basics.i_basic_maths;

// TC -> O(n) SC -> O(1)
public class FactorialOfANumber {

    public static void main(String[] args) {
        int n = 0;
        int m = 4;
        System.out.println(factorial(n));
        System.out.println(factorial(m));
    }

    public static int factorial(int x ) {
        if (0 == x) {
            return 1;
        }
        int ans = 1;
        for(int i = 1; i<=x; i++) {
            ans = ans * i;
        }
        return ans;
    }
}