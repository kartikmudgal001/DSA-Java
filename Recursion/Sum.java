package Recursion;

public class Sum {
    public static int sum(int n ){
        if(n == 1){
            return 1;
        }

        int sm = sum(n-1);
        int fsm = n+sum(n-1);
        return fsm;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
