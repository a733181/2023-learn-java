public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            System.out.println("i" + i);
            i++;
        }
        while (j <= 5) {
            j++;
            System.out.println("j" + j);
            if (j == 2) {
                continue;
            }
            System.out.println("not continue");
        }

        for (int k = 0; k <= 20; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println("k" + k);
        }
        ;
    }
}
