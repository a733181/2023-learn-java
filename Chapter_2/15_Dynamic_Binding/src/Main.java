class A {
    public void hello() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    public void hello() {
        System.out.println("Hello from class B");
    }

}

public class Main {
    public static void main(String[] args) {
        A b1 = new B();
        A a1 = new A();
        b1.hello(); // JVM
        a1.hello();
    }
}
