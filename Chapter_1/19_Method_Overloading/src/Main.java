public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.add(2, 3);
        m.add("2", "3");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(String a, String b) {
        System.out.println(a + b);
    }
}
