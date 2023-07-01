package Recursion;

public class Tiling {
    public static int tilingProblem(int n){ // 2 X n floor size
        if(n==0 || n==1){
            return 1;
        }
        // make choice
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    
}
