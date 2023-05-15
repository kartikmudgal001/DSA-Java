import java.util.Scanner;

public class Patterns {
    public static void main(String args[]){
        /** 
        for(int i=0; i<10; i++){
            for(int j = 0; j<=10-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        // program 2
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
