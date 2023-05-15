package Arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String args[]){
        
        int marks[] = new int[100];
        // int numbers[] = {1, 2, 3};
        // String fruits = {"apple", "mango", "orange"};
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("maths: "+marks[2]);

        //updating
        marks[2] = marks[2]+1;
        System.out.println(marks[2]);

        // operation
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage is "+percentage);
        System.out.println("Array is of length "+marks.length);
         
        //passing arrays as arguments 

        
    }
}
