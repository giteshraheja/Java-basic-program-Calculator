public class Student1 {
    String name;
    int roll_no;

    Student1(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                " of Exercise 1";
    }

    public static void main(String[] args) {

        // Exercise 1
        Student1 student1 = new Student1("John", 2);
        System.out.println(student1.toString());

    }
}
