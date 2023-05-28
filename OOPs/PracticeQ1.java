package OOPs;
// Performing +,-,* operations on complex no using concept of object and class
public class PracticeQ1 {
    public static void main(String[] args) {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(2, 3);

        Complex sum = Complex.add(a, b);
        Complex diff = Complex.diff(a, b);
        Complex prod = Complex.product(a, b);

        sum.printComplex();
        diff.printComplex();
        prod.printComplex();
    }
    
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}
