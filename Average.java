import java.util.Scanner;

public class Average {
    double n1, n2, n3;

    void setNumber(double a, double b, double c) {
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;
    }

    double calculate() {
        double av = this.n1 + this.n2 + this.n3;
        double cal = av / 3;
        return cal;
    }

    void display(double av) {
        System.out.println("Average of the number is " + av);
    }

    public static void main(String[] args) {
        Average average = new Average();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 1st ");
        double a = console.nextDouble();
        System.out.println("Enter 2nd ");
        double b = console.nextDouble();
        System.out.println("Enter 3rd ");
        double c = console.nextDouble();
        average.setNumber(a,b,c);
        double cal = average.calculate();
        average.display(cal);
    }
}
