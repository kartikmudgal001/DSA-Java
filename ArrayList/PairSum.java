package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean PairSum1(ArrayList<Integer>list, int target){
        int lp = 0, rp = list.size()-1; 

        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true; 
            }
            else if((list.get(lp)+list.get(rp))<target){
                lp++;
            }           
            else{
                rp--;
            }
        }
        return false;
    }
    public static boolean PairSum2(ArrayList<Integer>list, int target){
        int n = list.size();
        int pivot = -1;
        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1, rp = pivot; 

        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==target){
                return true; 
            }
            else if((list.get(lp)+list.get(rp))<target){
                lp = (lp+1)%n;
            }           
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer>list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // System.out.println(PairSum1(list, 7));

        ArrayList<Integer>list = new ArrayList<>();
        // Sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(PairSum2(list,28));


    }
    
}
