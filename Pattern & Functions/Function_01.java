import java.util.Scanner;

public class Function_01 {
    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }

    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to get their product");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("Product is "+prod);

        int mul = multiply(20, 22);
        System.out.println(mul);



    }
    
}
