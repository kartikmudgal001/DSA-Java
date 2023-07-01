package Recursion;

public class PowerOfN {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = pow(x, n-1);
        // int xn = x*xnm1;
        // return xn; 
        return x*pow(x, n-1);
    }
    
    // optimised solution with complexity O(logn)
    public static int optimisedPow(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimisedPow(a, n/2);
        int halfPowersq = halfPower * halfPower;
        if(n%2!=0){
            halfPowersq = a*halfPowersq;
        }
        return halfPowersq;

    }
    public static void main(String[] args) {
        System.out.println(pow(5, 3));
        System.out.println(optimisedPow(2, 10));
    }
}
 