import java.util.Scanner;

public class Area7 {
    int l,b;
    Area7(int l, int b){
        this.l = l;
        this.b = b;
    }

    int returnArea(){
        return (this.l*this.b);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the length ");
        int l = console.nextInt();
        System.out.println("Enter the Breadth ");
        int b = console.nextInt();
        Area7 r = new Area7(l,b);
        int a = r.returnArea();
        System.out.println("Area Is " + a);
    }
}
