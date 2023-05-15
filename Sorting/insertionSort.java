package Sorting;

public class insertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding correct position for insert
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--; // it goes 1 back : needs to be adjusted
            }
            //insertion
            arr[prev+1] = curr;

        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {5,4,1,3,2};
        
        insertionSort(arr);
        printArr(arr);
    
}
}
