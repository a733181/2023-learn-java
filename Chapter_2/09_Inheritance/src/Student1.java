public class Student1 extends People1 {
    private int grades;

    public Student1(String name, int age, String address, String phone, int grades) {
        super(name, age, address, phone);
        this.grades = grades;
    }
}
