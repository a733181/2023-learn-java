public class Circle {

    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Circle.PI * Math.pow(radius, 2);
    }

}
