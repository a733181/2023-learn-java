public class Teacher1 extends People1 {
    private String subject;

    public Teacher1(String name, int age, String address, String phone, String subject) {
        super(name, age, address, phone);
        this.subject = subject;
    }
}
