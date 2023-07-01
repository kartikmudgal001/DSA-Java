package Recursion;

public class AssignmentRecursion {

    public static void allOccurances(int arr[],int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurances(arr, key, i+1);
    }
    
    static String  digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        //take last digit out
        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1)) + 1;
   } 
   
   //** */
   public static int countSubstr(String str, int i, int j, int n){
    if(n==1){
        return 1;
    }
    if(n==0){
        return 0;
    }
    int res = countSubstr(str, i+1, j, n-1)+ countSubstr(str, i, j-1, n-1) -countSubstr(str, i+1, j-1, n-2);
    
    if(str.charAt(i)==str.charAt(j)){
        res++;
    }
    return res;
   }

   public static void towerOfHanoi(int n, String src, String helper, String dest){
    //base
    if(n==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        return;
    }
    //transfer n-1 diskts to helper using destination as helper
    towerOfHanoi(n-1, src, dest, helper);
    // transfer bottom disk from source to destintion
    System.out.println("transfer disk "+n+" from " + src+" to "+dest);
    //transfer n-1 from helper to destination using source as helper
    towerOfHanoi(n-1, helper, src, dest);
   }
   
    public static void main(String[] args) {
      int n = 3;
      towerOfHanoi(n, "A", "B", "C");
    }
}
