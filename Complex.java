import java.util.Scanner;

public class Complex {
    double real, img;

    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    static void sum(Complex n1, Complex n2) {
        System.out.println("Sum of complex Numbers is " + (n1.real + n2.real) + "+" + (n1.img + n2.img) + "i");
    }

    static void dif(Complex n1, Complex n2) {
        System.out.println("Difference of complex Numbers is " + (n1.real - n2.real) + "+" + (n1.img - n2.img) + "i");
    }

    static void product(Complex n1, Complex n2) {
        System.out.println("Product of complex Numbers is " + (n1.real * n2.real) + "+" + (n1.img * n2.img) + "i");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the real Part of 1st no. ");
        double r1 = console.nextDouble();
        System.out.println("Enter the imaginary Part of 1st no. ");
        double i1 = console.nextDouble();
        System.out.println("Enter the real Part of 2nd no. ");
        double r2 = console.nextDouble();
        System.out.println("Enter the imaginary Part of 2nd no. ");
        double i2 = console.nextDouble();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex.sum(c1, c2);
        Complex.dif(c1,c2);
        Complex.product(c1,c2);

    }
}
