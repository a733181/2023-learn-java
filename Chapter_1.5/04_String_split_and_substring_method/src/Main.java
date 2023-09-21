public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        String s = "Hello World";
        String[] sArr = s.split(" ");
        printArr(sArr);
    }

    public static void example2() {
        String s = "Hello";
        s = s.substring(0, s.length() - 1);
        System.out.println(s);
    }

    public static void printArr(String[] arr) {
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
