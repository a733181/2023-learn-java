public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius < 0");
        } else {
            this.radius = radius;
        }
    }
}
