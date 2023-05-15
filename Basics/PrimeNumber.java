import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("PRIME");
        }else{
            boolean isPrime = true;
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n%i==0){
                 isPrime = false;
                }
            }
            if(isPrime == true){
              System.out.println("PRIME");
            }
            else{
             System.out.println("NOT PRIME");
            }
            }
        
    }
    
}
