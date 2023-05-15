
package Strings;
import java.util.Arrays;

public class anagrams {
    public static boolean checkAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char [] str1CharacterArray = str1.toCharArray();
            char [] str2CharacterArray = str2.toCharArray();
            Arrays.sort(str1CharacterArray); 
            Arrays.sort(str2CharacterArray); 
            if(Arrays.equals(str1CharacterArray, str2CharacterArray)){
                return true;
            }                      
    } 
    return false;
}
    public static void main(String args[]){
        String str1 = "HiH";
        String str2 = "HHH";
        System.out.print("Checking for Anagrams----> Result:");
        System.out.println(checkAnagrams(str1, str2));

    }
}
