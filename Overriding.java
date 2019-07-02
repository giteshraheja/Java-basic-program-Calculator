// Overloading and Overriding

import java.util.Scanner;

// parent
abstract class Car {

    String color;
    int seats;

    Car(String color, int seats) {
        this.color = color;
        this.seats = seats;
    }

    abstract void show();

    abstract void get(String color, int seats);
}

// child
class Honda extends Car {

    Honda(String color, int seats) {
        super(color, seats);
    }

    @Override
    void show() {
        System.out.println("Color of Honda car: " + color);
        System.out.println("Seats of Honda car: " + seats);
    }

    @Override
    void get(String color, int seats) {

        this.color = color;
        this.seats = seats;
        System.out.println("Success");
    }

    void price(int tube, int speaker) {
        System.out.println("Total price " + (tube + speaker));
    }

    void price(int tube, int speaker, int lights) {
        System.out.println("Total price " + (tube + speaker + lights));
    }

}

// child
class Hyundai extends Car {

    Hyundai(String color, int seats) {
        super(color, seats);
    }

    @Override
    void show() {
        System.out.println("Color of Hyundai car: " + color);
        System.out.println("Seats of Hyundai car: " + seats);
    }

    @Override
    void get(String color, int seats) {
        this.color = color;
        this.seats = seats;
        System.out.println("Success");
    }

}

// child
class Toyota extends Car {

    Toyota(String color, int seats) {
        super(color, seats);
    }

    @Override
    void show() {
        System.out.println("Color of Toyota car: " + color);
        System.out.println("Seats of Toyota car: " + seats);
    }

    @Override
    void get(String color, int seats) {
        this.color = color;
        this.seats = seats;
        System.out.println("Success");
    }

}

// executing main class
public class Overriding {
    public static void main(String[] args) {
        System.out.println("Method OverLoading");
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        Honda ho = new Honda("red", 4);
        ho.show();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        Hyundai hy = new Hyundai("black", 6);
        hy.show();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        Toyota to = new Toyota("black", 6);
        to.show();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.println("Input New Color for Honda & Press Enter");
        String color1 = console.next();
        System.out.println("Input New Seats for Honda & Press Enter");
        int seats1 = console.nextInt();
        ho.get(color1, seats1);
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Input New Color for Hyundai & Press Enter");
        String color2 = console.next();
        System.out.println("Input New Seats for Hyundai & Press Enter");
        int seats2 = console.nextInt();
        hy.get(color2, seats2);
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Input New Color for Toyota Press Enter");
        String color3 = console.next();
        System.out.println("Input New Seats for Toyota & Press Enter");
        int seats3 = console.nextInt();
        to.get(color3, seats3);
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("New Settings for all Cars");
        ho.show();
        hy.show();
        to.show();
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();


        // 2nd part
        System.out.println(" Method Overriding");
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Are you Purchasing Tube, Speaker, Lights Press 1 for Honda");
        System.out.println("Are you Purchasing Tube, Speaker only Press 2 for Honda");
        int choice = console.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.print("Price of tube ");
                int t = console.nextInt();
                System.out.print("Price of speaker ");
                int s = console.nextInt();
                System.out.print("Price of light ");
                int l = console.nextInt();
                ho.price(t, s, l);
                break;
            } else if (choice == 2) {
                System.out.print("Price of tube ");
                int t = console.nextInt();
                System.out.print("Price of speaker ");
                int s = console.nextInt();
                ho.price(t, s);
                break;
            } else {
                System.out.println("You entered Wrong Choice");
            }
        }
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
