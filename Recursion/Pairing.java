package Recursion;

public class Pairing {

    public static int totPairs(int n){
        //base
        if(n==1 || n==2){
            return n;
        }
        // make a choice
        int fnm1 = totPairs(n-1);
        int fnm2 = totPairs(n-2);
        int pairWays = (n-1)*fnm2;

        int totWays = fnm1+pairWays;
        return totWays;

        //using single return statement
        // return totPairs(n-1)+(n-1)*totPairs(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(totPairs(3));
    }
}
