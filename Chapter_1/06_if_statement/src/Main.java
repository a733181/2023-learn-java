public class Main {
    public static void main(String[] args) {
        boolean b = false;

        if (b) {
            System.out.println("b is True");
        } else {
            System.out.println("b is False");
        }

        int age = 80;
        if (age < 14) {
            System.out.println("小於 14");
        } else if ((age >= 14 && age <= 18) || age >= 80) {
            System.out.println("大於等於 14 或 小於等於 18 或 大於 80");
        } else {
            System.out.println("大於 18 小於 80");
        }
    }
}