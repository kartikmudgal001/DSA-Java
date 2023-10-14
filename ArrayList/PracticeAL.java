package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PracticeAL {

    public static boolean monotonicArrayCheck(ArrayList<Integer>list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                inc = false;
            }
            if(list.get(i)<list.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static ArrayList lonelyNum(ArrayList<Integer>nums){
            Collections.sort(nums);
            ArrayList<Integer>res = new ArrayList<>();
            for(int i = 1; i<nums.size()-1; i++){
                if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)){
                    res.add(nums.get(i));
                }
            }
            // for edge case
            if(nums.size()==1){
                res.add(nums.get(0));
            }
            if(nums.size()>1){
                if(nums.get(0)+1<nums.get(1)){
                    res.add(nums.get(0));
                }
                if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
                    res.add(nums.get(nums.size()-1));
                }
            }
            return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(9);
        // list.add(5);
        // list.add(6);

        // System.out.println(monotonicArrayCheck(list));

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonelyNum(list));
    }
    
}
