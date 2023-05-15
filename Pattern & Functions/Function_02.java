import java.util.Scanner;

public class Function_02 {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

     
    public static void main(String args[]){
        //calculate n!
        /* 
        int fact = factorial(5);
        System.out.println(fact);
        System.out.println("factorial 7 "+factorial(7));
        */

        // Claculate binomial coefficient
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of 'n' & 'r'");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binomial_coeff = n_fact/(r_fact*nmr_fact);
        System.out.println("Binomial Coefficient: "+binomial_coeff);
    }
    
}
