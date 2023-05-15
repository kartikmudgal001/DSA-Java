import java.util.Scanner;

public class IncomeTaxCalc {

    public static void main(String args[]){
        System.out.println("Enter your income in LPA: Hint-> 8, 10.20");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;

        if(income<5){
            System.out.println("0% Tax");
            tax = 0*income;
            System.out.println("Tax Amount = "+tax);
        }
        else if(income>=5 && income<=10){
            System.out.println("20% Tax");
            tax = 0.2*income;
            System.out.println("Tax Amount = "+tax);
        }
        else{
            System.out.println("30% Tax");
            tax = 0.3*income;
            System.out.println("Tax Amount = "+tax);
        }
    }


    
}
