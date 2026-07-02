package i_basics.i_basic_maths;

/**
 * GCDOfTwoNum
 * GFG GCD of two numbers
 */
public class GCDOfTwoNum {

    public static void main(String[] args) {
        int n = 30;
        int m = 36;
        System.out.println(findGCD(n, m));
        System.out.println(findGCDUsingEuclideanAlgo(n, m));
 
    }

    // Tc -> O( min(x,y)) sc - 1
    public static int findGCD(int x, int y) {
        int largest = 1;
        for(int i = Math.min(x, y); i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return largest;
    }

    // Tc -> O( log (min (x,y)) ) sc - 1
    public static int findGCDUsingEuclideanAlgo(int x, int y) {
        
       while (x != 0 && y != 0) {
           if (x > y) {
               x = x % y;
           }
            else {
               y = y % x;
           }
        }
        if (x == 0) {
            return y;
        }
        return x;
    }
}