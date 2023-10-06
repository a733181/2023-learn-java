public class Student extends People {
    private int grades;

    public Student(String name, int age, String address, String phone, int grades) {
        super(name, age, address, phone);
        this.grades = grades;
    }

    @Override
    public void sayHello() {
        System.out.println("Student " + name + " say hello");
    }

}
