package Arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            //comparison
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){ // right
                start = mid +1;
            }
            if(numbers[mid] > key){ // left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,4,5,6,7,8,9,10};
        int key = 8;
        System.out.println("Index of key is "+binarySearch(numbers, key));
    }
}

