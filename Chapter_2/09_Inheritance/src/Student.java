public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;
    private int grades;

    public Student(String name, int age, String address, String phone, int grades) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.grades = grades;
    }

    public void learn() {
        System.out.println("learn");
    }

    public void soutBasic() {
        System.out.print("name " + name);
        System.out.println(" age " + age);
    }
}
