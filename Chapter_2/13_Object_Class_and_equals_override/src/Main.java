public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 20, "Address", "0912345678", 20);
        Teacher t1 = new Teacher("Tom", 20, "Address", "0912345678", "Math");
        System.out.println(s1.equals(t1));

    }
}
