package DivideAndConquer;

public class RotatedArray {
    public static int search(int arr[], int target, int si, int ei){

        int mid = si+(ei-si)/2;

        // if mid == target
        if(arr[mid]==target){
            return mid;
        }

        //lies in l1
        if(arr[si]<= arr[mid]){
            //case a: left
            if(arr[si]<= target && target<= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                //case b: right
                return search(arr, target, mid+1, ei);
            }
        }
        // mid on l2
        else{
            //case c: right
            if(arr[mid]<= target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            // case d: left on l1 or l2
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args ) {
        int arr[] = {4,5,6,7,0,1,2};
        int index = search(arr, 0, 0, arr.length-1);
        System.out.println(index);
    }
    
}
