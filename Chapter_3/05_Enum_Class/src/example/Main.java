package example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Tom", Nationality.CANADIAN);
        Person p2 = new Person("John", Nationality.JAPANESE);
        System.out.println(p1.getName());
    }
}
