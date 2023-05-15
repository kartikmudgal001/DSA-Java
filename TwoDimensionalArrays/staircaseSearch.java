package TwoDimensionalArrays;

import java.util.Scanner;

public class staircaseSearch {
    // from (0,m-1)

    public static boolean staircaseSearch(int matrix [][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    // from (n-1,0)
    public static boolean staircaseSearch2(int matrix [][], int key){
        int row = matrix.length-1, col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        System.out.println("Enter the key to find:-");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        staircaseSearch2(matrix, key);
    }
    
}
