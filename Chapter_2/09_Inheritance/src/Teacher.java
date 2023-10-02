public class Teacher {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String subject;

    public Teacher(String name, int age, String address, String phone, String subject) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " teach " + subject);
    }

    public void soutBasic() {
        System.out.print("name " + name);
        System.out.println(" age " + age);
    }
}
