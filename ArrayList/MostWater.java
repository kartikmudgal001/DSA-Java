package ArrayList;

import java.util.ArrayList;

public class MostWater {

    //brute force approach --> Time Complexity O(n^2)
    public static int mostWater(ArrayList<Integer>height){
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int h = Math.min(height.get(i), height.get(j));
                int water = h * (j-i);
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }
    //using 2 pointer approach --> Time Complexity O(n)
    public static int mostWaterInContainer(ArrayList<Integer>height){
        int maxWater = 0;
        int lp=0, rp=height.size()-1;
        int ht;
        while(lp<rp){
            ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int water = ht*width;
            maxWater = Math.max(maxWater, water);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.print("The max water that can be stored int the above slits: ");
        System.out.println(mostWaterInContainer(height)+" units");
    }
    
}
