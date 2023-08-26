package DivideAndConquer;

public class AssignmentDC {
    public static String[] mergeSortStrArr(String[] arr, int si, int ei){
        // Base
        if(si==ei){
            String[] A = {arr[si]};
            return A;
        }

        int mid = si+(ei-si)/2;
        String[] arr1 = mergeSortStrArr(arr, si, mid);
        String[] arr2 = mergeSortStrArr(arr, mid+1, ei);
        //merge
        String[] arr3 = merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m+n];

        // iterators for temp, arr1, arr2
        int idx = 0;
        int i = 0;
        int j = 0;
        
        while(i<m && j<n){
            if(isAlpabaticallySmaller(arr1[i], arr2[j])){
                arr3[idx]=arr1[i];
                i++;
            }
            else{
                arr3[idx]=arr2[j];
                j++;
            }
            idx++;
        }

        // left remains
        while(i<m){
            arr3[idx++]=arr1[i++];
        }
        // right remains
        while(j<n){
            arr3[idx++]=arr2[j++];
        }
        return arr3;
    }

    public static boolean isAlpabaticallySmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String [] sortedArr = mergeSortStrArr(arr, 0, arr.length-1);
        for(int i = 0; i<sortedArr.length; i++){
            System.out.print(sortedArr[i]+" ");
        }
    }
    
}
