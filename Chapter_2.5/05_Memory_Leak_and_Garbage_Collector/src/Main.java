public class Main {
    public static void main(String[] args) {
        People p1 = new People("Tom");
        People p2 = new People("Join");
        p1.sayHello();
        p2.sayHello();
        System.out.println("---");
        p1 = p2;
        p1.sayHello();
        p2.sayHello();
    }
}
