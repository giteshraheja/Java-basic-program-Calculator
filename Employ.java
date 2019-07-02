public class Employ {
    String name;
    double noOfHours;
    double salary;

    Employ(String name){
        this.name = name;
    }

    void getInfo(double sal, double noOf) {
        this.noOfHours = noOf;
        this.salary = sal;
    }

    void addSal(){
        if (this.salary < 500){
            this.salary+=10;
        }
    }

    void addWork(){
        if (this.noOfHours>6){
            this.salary+=5;
        }
    }

    void printSalary(){
        System.out.println("Salary of " + this.name + " is: " + this.salary);
    }


    public static void main(String[] args) {
        Employ e1 = new Employ("B");
        e1.getInfo(800,8);
        e1.addSal();
        e1.addWork();
        e1.printSalary();
        Employ e2 = new Employ("A");
        e2.getInfo(200,4);
        e2.addSal();
        e2.addWork();
        e2.printSalary();
        Employ e3 = new Employ("C");
        e3.getInfo(400,7);
        e3.addSal();
        e3.addWork();
        e3.printSalary();
    }

}
