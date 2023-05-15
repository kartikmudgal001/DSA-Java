import java.util.Scanner;

public class BasicCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nos");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+': System.out.println(input1+input2);
                        break;
            case '-': System.out.println(input1-input2);
                        break;
            case '*': System.out.println(input1*input2);
                        break;
            case '/': System.out.println(input1/input2);
                        break;
            case '%': System.out.println(input1%input2);
                        break;
            default: System.out.println("Wromg Operator!!");
        }
    }
    
}
