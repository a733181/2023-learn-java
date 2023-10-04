public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Tom", 20, "address", "0912345678", 20);
        s1.sayHello();
        Teacher t1 = new Teacher("Tom", 20, "address", "0912345678", "math");
        t1.sayHello();
    }
}
