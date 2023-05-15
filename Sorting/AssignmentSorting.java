package Sorting;

public class AssignmentSorting {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int maxpos = i;
            for(int j = i+1; j<n; j++){
                if(arr[maxpos]<arr[j]){
                    maxpos = j;
                }
            }
            //swap
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int prev = i-1, curr = arr[i];
            //finding index to place element
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insert
            arr[prev+1] = curr;
        }
    }
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        // creating frequency array
        for(int i = 0; i<n; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i = count.length-1; i>0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
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
       int[] arr = {3,6,2,1,8,7,4,5,3,1};
       printArr(arr);
       countingSort(arr);
       System.out.println("In decreasing Order");
       printArr(arr);
    }
    
}
