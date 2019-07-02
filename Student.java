public class Student {
    String name;
    int roll_no;
    String phone_number;
    String address;

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                " of Exercise 2";
    }

    Student(String name, int roll_no, String phone, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_number = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        // Exercise 2
        Student student1 = new Student("John", 2, "6634567820", "Delhi");
        Student student2 = new Student("Sam", 3, "12345678923", "Noida");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
