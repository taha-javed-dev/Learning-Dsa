package i_basics.i_basic_maths;

// LeetCode 7. Reverse Integer
// TC -> O( log10 number) SC -> O(1)
public class ReverseAInteger {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }

    public static int reverse(int x) {
      int rev = 0;
      while(x > 0) {
        int lastDig = x % 10;
        rev = rev * 10;
        rev = rev + lastDig;
        x = x / 10;
      }
      return rev;
    }
    
}