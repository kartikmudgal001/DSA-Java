package Sorting;

public class selectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
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
        selectionSort(arr);
        printArr(arr);
    }
}
