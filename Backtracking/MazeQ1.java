package Backtracking;


public class MazeQ1 {

    public static boolean isSafe(int mazeArr[][], int x, int y){
        if(x<mazeArr.length && y<mazeArr.length && mazeArr[x][y]==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean mazeRun(int mazeArr[][], int x, int y, int pathArr[][]){
        // base
        if(x==mazeArr.length-1 && y==mazeArr.length-1){
            pathArr[x][y]=1;
            return true;
        }
        // recursion
        if(isSafe(mazeArr, x, y)){
            pathArr[x][y]=1;
            if(mazeRun(mazeArr, x+1, y, pathArr)){
                return true;
            }
            if(mazeRun(mazeArr, x, y+1, pathArr)){
                return true;
            }
            pathArr[x][y]=0; // Backtracking
            return false;
        }
        return false;
    }
    public static void printArr(int mazeArr[][]){
        for(int i=0; i<mazeArr.length; i++){
            for(int j=0; j<mazeArr.length; j++){
                System.out.print(mazeArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mazeArr[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        System.out.println("Rat trap");
        printArr(mazeArr);
        int n = mazeArr.length;
        int pathArr[][]=new int[n][n];
        for(int i=0; i<mazeArr.length; i++){
            for(int j=0; j<mazeArr.length; j++){
                pathArr[i][j]=0;
            }
        }
        if(mazeRun(mazeArr, 0, 0, pathArr)){
            System.out.println("Rat will escape!");
            printArr(pathArr);
        }
        else if(mazeRun(mazeArr, n, n, pathArr)==false){
            System.out.println("Rat is stuck");
        }
            
        }
    }

