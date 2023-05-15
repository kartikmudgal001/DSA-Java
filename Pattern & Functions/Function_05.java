public class Function_05 {

    public static void DecimalToBinary(int deciNum){
        int myNum = deciNum;
        int binNum = 0;
        int power = 0;
        while(deciNum>0){
            int rem = deciNum%2;
            binNum = binNum + rem*(int)(Math.pow(10, power));
            deciNum = deciNum/2;
            power++;


        }
        System.out.println("Binary of "+myNum+" = "+binNum);

    }

    public static void main(String args[]){
        DecimalToBinary(32);
    }
    
}
