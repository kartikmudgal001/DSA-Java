package Arrays;
//this is not the most optimised approach
public class AssignmentArrays {
    public static boolean checkDistinct(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static void rotateArray(int arr[]){
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        System.out.println(checkDistinct(arr));
    }

    
}
