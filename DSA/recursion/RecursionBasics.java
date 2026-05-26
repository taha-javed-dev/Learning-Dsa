package recursion;

class RecursionBasics {

     static void main (String[] args) {

        System.out.println(sumOfNaturalNum(5));
        System.out.println(fibonacci(8));
        System.out.println(nCr(5,1));
        System.out.println(josephus(5,2));
        String s = "abab";
        System.out.println(isPalindrome(s));

    }

    // Time Complexity -> O(n), Space Complexity -> O(n)
    static int sumOfNaturalNum( int n ) {
        if (n == 1 ) return 1;
        return n + sumOfNaturalNum(n-1);
    }

    // Time Complexity -> O(2^n), Space Complexity -> O(n)
    static int fibonacci( int n ) {
        if ( n == 0 || n == 1 ) return n;
        return fibonacci(n - 2) + fibonacci( n - 1);
    }

    // Time Complexity -> O(2^n), Space Complexity -> O(n)
    static int nCr(int n, int r) {
        if ( n == r || r == 0 ) return 1;
        return nCr(n - 1 ,r - 1) + nCr(n - 1, r);
    }

    // Time Complexity -> O(n), Space Complexity -> O(n)
    static int josephus( int n , int k) {
        if ( n == 1) return 0;
        return (josephus(n-1,k) + k) % n;
    }

    // Time Complexity -> O(n), Space Complexity -> O(n)
    static boolean isPalindrome( String s) {
        return isPalindromeHelper(s,0,s.length()-1);
    }

    static boolean isPalindromeHelper (String s, int l, int r) {
        if ( l >= r) return true;
        if ( s.charAt(l) == s.charAt(r)) {
            return isPalindromeHelper(s,l+1,r-1);
        }
        else {
            return false;
        }
    }
}