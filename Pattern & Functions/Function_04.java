import java.util.Scanner;

public class Function_04 {
    public static void binaryToDecimal(int binNum){
        int myNum = binNum;
        int power = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum +(int)(lastDigit*Math.pow(2, power));
            power++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+myNum+" = "+decNum); 
        

    }
    public static void decimalToBinary(int decNum){
        while(decNum==0){
             
        }
    }

        public static void main(String args[]){
            System.out.println("Enter the Binary Number");
            Scanner sc = new Scanner(System.in);
            int binaryNum = sc.nextInt();
            binaryToDecimal(binaryNum);

    }
}
