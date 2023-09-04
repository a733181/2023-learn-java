import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // BMI (kg / m^2)
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入體重(公斤)：");
        float weight = scanner.nextFloat();

        System.out.print("請輸入身高(公分)：");
        float height = scanner.nextFloat() / 100;

        float bmi = Float.parseFloat(DF.format(weight / (height * height)));

        System.out.println("BMI 是；" + bmi);
        if (bmi < 18.5) {
            System.out.println("過輕");
        } else if (bmi < 20) {
            System.out.println("正常");
        } else if (bmi < 30) {
            System.out.println("稍重");
        } else {
            System.out.println("過重");
        }
    }
}
