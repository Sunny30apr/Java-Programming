import java.util.*;

public class ComplexNumCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real & imaginary of 1st num: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.print("Enter real & imaginary of 2nd num: ");
        int c=sc.nextInt();
        int d=sc.nextInt();

        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(c, d);

        System.out.print("1st number: ");
        c1.printComplex(a, b);
        System.out.print("2nd number: ");
        c1.printComplex(c, d);
        System.out.print("sum: ");
        c1.sum(a, b, c, d);
        System.out.print("Difference: ");
        c1.diff(a, b, c, d);
        System.out.print("Product: ");
        c1.mul(a, b, c, d);

    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real=r;
        imag=i;
    }

    void printComplex(int real, int imag) {
        if(real == 0 && imag != 0) {
            System.out.println(imag + "i");
        }
        else if(imag == 0 && real !=0) {
            System.out.println(real);
        }
        else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    void sum(int a, int b, int c, int d) {
        int real=a+c;
        int imag=b+d;
        printComplex(real, imag);
    }

    void diff(int a, int b, int c, int d) {
        int real=a-c;
        int imag=b-d;
        printComplex(real, imag);
    }

    void mul(int a, int b, int c, int d) {
        int real=a*d + b*c;
        int imag=a*c - b*d;
        printComplex(real, imag);
    }
}