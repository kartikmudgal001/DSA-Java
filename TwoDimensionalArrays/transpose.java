package TwoDimensionalArrays;

public class transpose {
    public static void main(String args[]){
        int matrix[][] = {{2,3,4},{5,6,7}};
        System.out.println("The matrix is: ");
        printMatrix(matrix);
        int m = matrix[0].length, n=matrix.length;
        int transpose[][] = new int[m][n];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The transpose of matrix is: ");
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
