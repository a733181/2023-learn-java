public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mike", 30, "Address", "0912345677", "國文");
        Teacher t2 = new Teacher("Tom", 32, "Address", "0912345678", "數學");
        Student s1 = new Student("Spencer", 18, "Address", "0912345676", 80);

        t1.soutBasic();
        t2.soutBasic();
        s1.soutBasic();

        Teacher1 t11 = new Teacher1("Mike1", 30, "Address", "0912345677", "國文");
        Student1 s11 = new Student1("Spencer1", 18, "Address", "0912345676", 80);
        t11.soutBasic();
        s11.soutBasic();
    }
}
