import java.util.Scanner;

public class Function_03 {
    //method to check if a number is a prime or not
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //method to print primes in a range
    public static void primesInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){//true
                System.out.print(i+" ");
            }
        }
        System.out.println();
            
    }
    public static void main( String args[]){
        System.out.println("Enter the number to check if its Prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        primesInRange(num);
    }
    
}
