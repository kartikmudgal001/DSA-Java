package BitManipulation;

public class swap2nos {

    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("Before Swap: x = "+x+", y = "+y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After Swap: x = "+x+", y = "+y);
    }
    
}
