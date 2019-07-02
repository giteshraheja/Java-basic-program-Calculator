import org.jetbrains.annotations.Contract;

public class Triangle {
    int a = 3, b = 4, c = 5;
    int area, perimeter;

    Triangle() {
    }

//  Constructor Overloading
//    Triangle(int newA, int newB, int newC) {
//        this.a = newA;
//        this.b = newB;
//        this.c = newC;
//    }


    // New try
    Triangle(int newA, int newB, int newC) {
        this.a = newA;
        this.b = newB;
        this.c = newC;
        int st = ((this.a + this.b + this.c) / 2);
        this.area = (int) Math.sqrt(st * (st - this.a) * (st - this.b) * (st - this.c));
        this.perimeter = (this.a + this.b + this.c);
    }

    public static void main(String[] args) {

//        Exercise 3
        Triangle t = new Triangle();
        int s = ((t.a + t.b + t.c) / 2);
        int area = (int) Math.sqrt(s * (s - t.a) * (s - t.b) * (s - t.c));
        System.out.println("Area is " + area);
        Triangle p = new Triangle();
        System.out.println("Perimeter of a triangle is " + (p.a + p.b + p.c));


//        Exercise 4
//        Triangle ct = new Triangle(3,4,5);
//        int st = ((ct.a + ct.b + ct.c) / 2);
//        int areat = (int) Math.sqrt(st * (st - ct.a) * (st - ct.b) * (st - ct.c));
//        int perimetert = (ct.a + ct.b + ct.c);
//        System.out.println("Area is: " + areat);
//        System.out.println("Parameter is: " + perimetert);


//      New Try Exercise 4
        Triangle ct = new Triangle(3,4,5);
        System.out.println("Area is: " + ct.area);
        System.out.println("Parameter is: " + ct.perimeter);

    }
}
