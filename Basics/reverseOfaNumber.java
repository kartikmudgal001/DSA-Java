import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class reverseOfaNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int lastDigit;
        
        while(number>0 ){
            lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
    }
    
}
