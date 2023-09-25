public class Circle {

    private double circle;

    public Circle() {
        circle = 1.0;
    }

    public Circle(double newCircle) {
        circle = newCircle;
    }

    public double getArea() {
        return Math.PI * circle * circle;
    }
}
