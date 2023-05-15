import java.util.Scanner;

public class Assignment_Functions {
    public static double avgOfpalindromebers(Double a, Double b, Double c){
        
        return (a+b+c)/3;

    }
    public static boolean isEven(int a){
       if(a%2==0){
        return true;
       }
       else{
       return false;
       }
    }
    public static boolean checkPalindrome(int num){
        int palindrome = num;
        int rev = 0;
        while(palindrome!=0){
            int lastDigit = palindrome%10;
            rev = rev*10 + lastDigit;
                palindrome = palindrome/10;
        }
        if(num == rev){
            return true;
        }
        return false;

    }

    public static void main(String args[]){
    // System.out.println(avgOfpalindromebers(15.0, 5.0, 5.0));
    // System.out.println(isEven(9));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();

    if(checkPalindrome(num)){//is true
        System.out.println(num+" is a palindrome");
    }
    else{
        System.out.println(num+" is not a palindrome");
    }


    }
}
