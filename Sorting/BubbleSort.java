package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {5,2,8,1,4,10,3,2,7,9,45,22,11,4};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
    
}
