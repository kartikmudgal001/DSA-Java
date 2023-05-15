public class PatternsAdv {

    public static void hollow_rectangle(int totRows, int totColumns){
        // outer loop
        for(int i = 1; i<=totRows; i++){
            // inner loop
            for(int j=1; j<=totColumns; j++){
                if(i == 1||i == totRows||j == 1||j == totColumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
    }
    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroOne_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
               if((i+j)%2==0){
                System.out.print(1);
               }
               else{
                System.out.print(0);
               }
        }
        System.out.println();
    }
    }
    public static void butterfly_triangle(int n){

        // first half
        for(int i=1; i<=n; i++){
        //inc
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
        //spaces
            for(int j = 1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
        //dec
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        } 
        // 2nd half
        for(int i=n; i>=1; i--){
            //inc
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
            //spaces
                for(int j = 1; j<=(2*(n-i)); j++){
                    System.out.print(" ");
                }
            //dec
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
            }
    }
    public static void solid_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void hollow_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
            // hollow rect- stars
            for(int j=1; j<=n; j++){
                if(i == 1||i == n||j == 1||j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
    }
    public static void diamond(int n){
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            // spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    public static void main(String args[]){
        // hollow_rectangle(4, 5);
        // floyds_triangle(8);  
        // zeroOne_triangle(5);
        // butterfly_triangle(10);
        // solid_rhombus(8);
        // hollow_rhombus(10);
        diamond(8);
    }
    
}
