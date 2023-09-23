public class Main {
    public static void main(String[] args) {
        example1();
    }

    public static void example1() {
        // 遞迴函數
        printHi(10);
    }

    public static void printHi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("Hi " + "print i = " + i);

        printHi(i - 1);
        System.out.println("finish " + i);
    }
}
