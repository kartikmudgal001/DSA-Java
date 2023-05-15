import java.util.Scanner;

public class Practice_01 {
    public static void main(String args[]){
        /** 
        System.out.println("Enter the no till you want to print Even/Odd sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
        }
        System.out.println("Sum of even numbers upto "+n+" is "+sum1);
        System.out.println("Sum of odd numbers upto "+n+" is "+sum2);
        */
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number ");
            number=sc.nextInt();
            if(number%2==0) {
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0f or no");
            choice=sc.nextInt();
        }while(choice==1);
        
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);

    }
    
}
