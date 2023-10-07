public class Teacher extends People {
    private String subject;


    public Teacher() {
        // child class constructor doesn't invoke super()
    }

    public Teacher(String name, int age, String address, String phone, String subject) {
        super(name, age, address, phone);
        this.subject = subject;
    }

    public void printHello() {
        super.sayHello();
        // this.sayHello();
        // sayHello();
    }
}
