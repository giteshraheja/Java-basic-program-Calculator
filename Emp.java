import java.util.ArrayList;
import java.util.List;
import java.util.Collections.*;

public class Emp {
    String name;
    int year;
    String address;

    Emp(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public static void display(List<Emp> emp){
        System.out.printf("%-10s %20s %25s %n", "Name", "Year of joining", "Address");
        for (Emp e:emp) {
//            System.out.println(e.name+"\t \t"+ e.year+"\t \t"+ e.address+"\n");
            System.out.printf("%-10s %20s %25s %n", e.name, e.year, e.address);
        }

    }

    public static void main(String[] args) {
        Emp e1 = new Emp("Robert",1994, "64 C- Wall Street");
        Emp e2 = new Emp("Sam",2000, "68 G- Wall Street");
        Emp e3 = new Emp("John",1999, "26 D- Wall Street");
        List<Emp> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e3);
        emp.add(e2);
        Emp.display(emp);
    }
}
