public class Main {
    public static void example1() {
        System.out.println("--example1--");
        int a = 5;
        int b = 6;
        // a = 6 ; b = 5
        int c = a;
        a = b;
        b = c;
        System.out.println(a + "," + b);
    }

    public static void example2() {
        System.out.println("--example2--");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 數字 1 跟 4 對調
        int temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;
        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

    public static void main(String[] args) {
        example1();
        example2();
    }
}
