public class Main {
    public static void main(String[] args) {
        example1(10);
        example1(9);
    }

    public static void example1(int num) {
        if (num % 2 == 0) {
            System.out.println("是偶數");
        } else {
            System.out.println("不是偶數");
        }
    }
}
