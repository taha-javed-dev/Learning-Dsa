package i_basics.i_basic_maths;


// LeetCode 9. Palindrome Number
// TC -> O( log10 number) SC -> O(1)

public class PalindromeNumber {
    
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int rev = 0;
        while(x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10;
            rev = rev + lastDigit;
            x = x / 10;
        }
        if(rev == temp) return true;
        return false;
    }
}
