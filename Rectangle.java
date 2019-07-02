public class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle with sides " + this.l + ", " + this.b + " is " + (this.l * this.b));
    }

    void area(int newL, int newB) {
        System.out.println("Area of Rectangle " + newL + ", " + newB + " is " + (newL * newB));
    }

    public static void main(String[] args) {

        // Example 5
        Rectangle r1 = new Rectangle(4, 5);
        r1.area();
        System.out.println();
        r1.area(5, 8);

    }
}
