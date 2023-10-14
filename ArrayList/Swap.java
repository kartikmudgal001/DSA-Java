package ArrayList;
import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer>list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        swap(list, 2, 0);
        System.out.println(list);
        
    }
    
}
