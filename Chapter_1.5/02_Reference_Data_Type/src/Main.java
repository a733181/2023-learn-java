public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }

    public static void changeA(int a) {
        a = 20;
    }

    public static void example1() {
        System.out.println("--example1--");
        int a = 10;
        changeA(a);
        /*
        a 是一個整數型態的變數，並且在 main 方法中初始化為 10。
        當呼叫 changeA(a) 時，將 a 的值傳遞給 changeA 方法。
        在 changeA 方法中，接收到這個值，並將其命名為 a，但這個 a 是在方法內部的一個新變數，和 main 方法中的 a 沒有直接的關聯。
        當在 changeA 方法內部對 a 進行改變，例如 a = 20;，這實際上只是在該方法的範疇內改變了這個新的 a 變數的值，並不會影響到 main 方法中的 a。
        因此，當在 main 方法中印出 a 的值時，它仍然保持為 10。
         */
        System.out.println(a);
    }

    public static void example2() {
        System.out.println("--example2--");
        int a = 10;
        int b = a;
        a = 30;
        System.out.println(a + "," + b);
    }

    public static void example3() {
        System.out.println("--example3--");
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;
        array1[0] = 100;
        System.out.println("array1");
        System.out.println(array1);
        printArray(array1);

        System.out.println("array2");
        System.out.println(array2);
        printArray(array2);
    }

    public static void example4() {
        System.out.println("--example4--");
        int[] array1 = {100, 200, 300};
        changeArray(array1, 0, 400);
        printArray(array1);
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    public static void changeArray(int[] array, int index, int number) {
        array[index] = number;
    }
}
