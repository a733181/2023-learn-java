public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 20);
        Person p2 = new Person("p2", 20);
        p1.setSpouse(p2);
        p2.setSpouse(p1);
        p1.talk();
        p2.talk();
    }
}
