package Arrays;

public class SubArrays {

    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                    for(int k = start; k<=end; k++){
                        System.out.print(numbers[k]+" ");
                        
                    }
                    ts++;
                    System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total no of substrings possibe: "+ts);
    }
    public static void maxSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                    currSum = 0;
                    for(int k = start; k<=end; k++){
                        currSum += numbers[k]; 
                    }
                    System.out.println(currSum);
                    if(maxSum<currSum){
                        maxSum = currSum;
                    }
            }
        }
        System.out.println("The MAX of substrings : "+maxSum);
    }
   
    //optimised approach
    public static void maxSum_prefix(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+ numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                    currSum = start==0?prefix[end]: prefix[end]-prefix[start-1];
                    if(maxSum<currSum){
                        maxSum = currSum;
                    }
            }
        }
        System.out.println("The MAX of substrings : "+maxSum);
    }
    /*most optimised -- important
    this code will not give sum for a complete negative array, for that we have 
    to write a special case
    */
    public static void maxSum_kadane(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            cs += numbers[i];
            if( cs<0 ){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max sum of subarray: "+ms);
    }
    public static void main(String args[]){
        // int numbers[] = {2, 4, 6, 8, 10};
        // printSubarrays(numbers);
        // maxSum(numbers);
        // maxSum_prefix(numbers);
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5};
        maxSum_kadane(numbers);
    }
    
}
