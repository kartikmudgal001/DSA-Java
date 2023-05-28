package OOPs;

public class MethodOverloading {
    //Method Overloading is a type of Compile Time Polymorphism
    public static void main(String[] args) {
         // creating object of Calculator class
        Calculator calc = new Calculator();
        System.out.println(calc.sum(12, 13));
        System.out.println(calc.sum((float)12.5, (float)5.6));
        System.out.println(calc.sum(1, 5, 4));

    }
    
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return  a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

}
