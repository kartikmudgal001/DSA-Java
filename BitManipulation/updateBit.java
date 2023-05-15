package BitManipulation;
public class updateBit {
    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n|bitmask;
    }
    public static int updateBit(int n, int i, int newBit){
        n = clearBit(n, i);
        int bitmask = newBit<<i;
        return n|bitmask;

    }
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
