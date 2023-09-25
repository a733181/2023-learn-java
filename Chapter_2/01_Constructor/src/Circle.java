public class Circle {
    private double radius;

    // 在 new 時會執行
    // constructor
    public Circle(double newRadius) {
        radius = newRadius;
        System.out.println(radius);
    }
}
