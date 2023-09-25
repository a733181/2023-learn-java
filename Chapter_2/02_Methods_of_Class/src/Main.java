import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num);
    }
}
