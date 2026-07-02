package i_basics.i_basic_maths;

// TC -> O( log10 number) SC -> O(1)

public class ReturnLargestDigit {
    
    public static void main(String[] args) {
        int n = 1262;
        System.out.println(lastgestDigit(n));
    }

    public static int lastgestDigit(int x) {
        int largest = 0;
        while (0 < x) {
            int lastDigit = x % 10;
            if (lastDigit > largest) {
                largest = lastDigit;
            }
            x = x / 10;
        }

        return largest;
    }
}
