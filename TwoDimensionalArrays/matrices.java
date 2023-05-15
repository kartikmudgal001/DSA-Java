package TwoDimensionalArrays;
import java.util.Scanner;
public class matrices {
    public static void main(String args[]){
        
        int matrix[][] = new int[3][3];
        int n = matrix.length, m=matrix[0].length;
        Scanner sc  = new Scanner(System.in);
        for(int row=0; row<n;row++){
            for(int column=0; column<m; column++){
                matrix[row][column] = sc.nextInt();

            }
        }
        //output
        for(int row=0; row<n;row++){
            for(int column=0; column<m; column++){
                System.out.print(matrix[row][column]+" ");;

            }
            System.out.println();
        }
    }
}
