package DivideAndConquer;

public class QuickSort {

    public static void quickSort(int arr[], int si, int ei){
        // Base case
        if(si>ei){
            return;
        }

        // pivot will be last element
        int pivot_index = partition(arr, si, ei);
        quickSort(arr, si, pivot_index-1); // left
        quickSort(arr, pivot_index+1, ei); // right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for elements smaller than pivot
 
        for(int j = si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp; 
        return i;
    }
    public static void printArray(int arr []){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,2,6,8,7,5,9};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
