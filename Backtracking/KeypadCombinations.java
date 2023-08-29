package Backtracking;

import java.util.Scanner;

public class KeypadCombinations {
    public static String mapping[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    private static void solve(String digit, int index, String ans){
        // base case
        if(index==digit.length()){
            System.out.println(ans);
            return;
        }
        // recursion
        char currChar = digit.charAt(index);
        String value = mapping[currChar-'0'];
        for(int i=0; i<value.length(); i++){
            solve(digit, index+1, ans+value.charAt(i));
        }
        
    }

    public static void main(String[] args) {
        String ans = "";
        Scanner sc = new Scanner(System.in);
        String  digit = sc.next();  
        solve(digit, 0, ans);
    }
    
}
