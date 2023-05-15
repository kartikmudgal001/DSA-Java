package Arrays;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        /*Program to find a key in array */
        // int numbers[] = {2, 4, 5, 7, 10, 23, 1, 32};
        // int key = 10;
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //    System.out.println("Not Found!");
        // }
        // else{
        //     System.out.println("key is at index "+index);
        // }
        
        // int numbers[] = {2, 4, 5, 7, 10, 70, 1, 32};
        // System.out.println("Max of the numbers is "+largestNumber(numbers));
        
    }
    
}
