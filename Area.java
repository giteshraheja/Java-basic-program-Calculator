import java.util.Scanner;

public class Area {
        int l, b;

        public void setDim(int a, int b){
            this.l = a;
            this.b = b;
        }
        public void getArea(){
            System.out.println("Area of Rectangle is \t" + (this.l*this.b));
        }

    public static void main(String[] args) {
        Area r = new Area();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length");
        int l = console.nextInt();
        System.out.println("Enter breadth");
        int b= console.nextInt();
        r.setDim(l,b);
        r.getArea();

    }
}
