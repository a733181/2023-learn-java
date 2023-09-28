public class Circle {
    // this keyword

    private double radius;

    public Circle() {
        this(2.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
