public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main m = new Main();
        int number1 = m.multiply(5, 6);
        m.testing1(5);
        m.testing2();
        m.testing3();
        System.out.println(m.testing4(4));
    }

    public void testing1(int number) {
        System.out.println("test1");
        int i = 0;
        while (true) {
            i++;
            if (i == number) {
                System.out.println(number);
                return;
            }
        }
    }

    public void testing2() {
        System.out.println("test2");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println(j + "," + i);
            }
        }
    }

    public void testing3() {
        System.out.println("test3");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.println(j + "," + i);
            }
        }
    }

    public String testing4(int i) {
        if (i % 2 == 0) {
            return "是2的倍數";
        }

        return "不是2的倍數";
    }

    public int multiply(int x, int y) {
        return x * y;
    }

}
