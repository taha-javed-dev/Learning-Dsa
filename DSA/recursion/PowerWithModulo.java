package recursion;


// Fast Power + Power with Modulo
public class PowerWithModulo {

    static void main() {
        int a = 7;
        int b = 7;
        int m = 30;
        System.out.println(power(a,b));
        System.out.println(fastPower(a,b));
        System.out.println(fastPowerWithModulo(a,b,m));
    }


    // recursion a * a^b-1  base case -> b == 0
    // TC -> O(n)
    static double power(double a, int b){
        if (b == 0) return 1;
        return a * power(a, b-1);
    }

    //Fast Power
    // Even -> (a^2)^b/2,  Odd -> a*a^b-1
    // TC -> O(log b)
    static double fastPower(double a, int b) {


        if (b == 0) return 1;                                  // Base Condition
        if (b % 2 == 0) return  fastPower( a*a, b/2);    // If b is Even
        else return a * fastPower(a, b-1);                  // If b is Odd
    }

    //Fast Power with Modulo
    //
    static double fastPowerWithModulo(double a, int b, int m) {
        if (b == 0) return 1;                                                   // Base Condition
        if (b<0) return fastPowerWithModulo(1/a, Math.abs(b), m);                         // If b is Negative
        if (b % 2 == 0) return  fastPowerWithModulo( (a % m * a % m) % m, b/2, m);     // If b is Even
        else return ( a % m * fastPowerWithModulo(a, b-1, m) % m ) % m ;                  // If b is Odd
    }
}
