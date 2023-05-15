package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuiltSortTest {
    public static void printArr(Integer[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {5,4,1,3,2};
        Integer[] arr2 = {5,4,1,3,2};
        // Arrays.sort(arr);
        // printArr(arr);
        // Arrays.sort(arr, 1, 3);
        // printArr(arr);
        Arrays.sort(arr2, Collections.reverseOrder());
        // Arrays.sort(arr2, 1, 3,Collections.reverseOrder()); 
        printArr(arr2);
        
    }
}
