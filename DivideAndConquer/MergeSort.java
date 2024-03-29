package DivideAndConquer;

public class MergeSort {
    public static void printArray(int arr []){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        //base
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, 0, mid); // left
        mergeSort(arr, mid+1, ei); // right
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left
        int j = mid+1; // iterator for right
        int k = 0; // iterator for temp 

        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]){
                temp [k] = arr[i];
                i++; 
            }
            else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
        // left
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,0,1,5,4};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
