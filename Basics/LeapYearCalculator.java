import java.util.Scanner;

public class LeapYearCalculator {
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year!");
        int year = sc.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = (year%100 == 0) && (year%400 == 0);

        System.out.println("value of x "+x);
        System.out.println("value of y "+y);
        System.out.println("value of z "+z);

        if(x && (y||z)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not leap year");
        }
    }
}
