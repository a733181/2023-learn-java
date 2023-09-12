import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 10;
        Random r = new Random();
        int score = r.nextInt(min + max) + min;
        System.out.println(score);


        while (true) {
            System.out.print("數字大於 " + min + " 小於 " + max + "：");
            int value = s.nextInt();

            if (value < min || value > max) {
                System.out.println("請輸入 " + min + " 到 " + max);
                continue;
            }
            if (score == value) {
                System.out.println("猜中數字了！" + score);
                break;
            } else if (value < score) {
                min = value;
            } else {
                max = value;
            }
        }
    }
}
