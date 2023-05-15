package Arrays;

public class ReverseArray {
    
    public static void reverseArray(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        
    }
    public static void main(String args[]){
        int numbers[] = {1, 3, 7, 8, 9, 10};
        int numbers2[] = {1, 3, 7, 8, 9};
        reverseArray(numbers);
        System.out.println("Reversed array is : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
    }
}
