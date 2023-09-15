public class Main {

    public Main() {
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.sayHello();
        System.out.println(m.multiply(1, 3));
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int multiply(int x, int y) {
        return x * y;
    }

}
