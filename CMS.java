import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Collections.*;

class Employee {
    private int id, age, salary;
    private String name, address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nEmployee" +
                "id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int id, String name, int age, String address, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    Employee() {
    }

}


public class CMS {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee b1 = new Employee(1, "Gitesh", 22, "Son", 1008);
        employees.add(b1);
        Employee b2 = new Employee(2, "Raheja", 23, "Del", 1002);
        employees.add(b2);
        Employee b3 = new Employee(3, "Lakshay", 42, "Pan", 1010);
        employees.add(b3);
        Employee b4 = new Employee(4, "Sonam", 52, "Noi", 1030);
        employees.add(b4);
        Employee b5 = new Employee(5, "Sunita", 32, "Gur", 1060);
        employees.add(b5);

        System.out.println("Employees are " + employees.toString());
        Scanner console = new Scanner(System.in);

        int choice = console.nextInt();
        if (choice == 1) {

        }
//        else if (choice == 2){
//
//        }
        else {
            System.out.println("Incorrect Choice");
        }

    }
}
