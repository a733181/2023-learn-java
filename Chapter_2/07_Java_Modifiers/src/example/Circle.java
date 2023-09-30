package example;

public class Circle {
    public static final int I = 0;
    // fields are usually private
    public double radius1;
    // protected 受保護的能在同一個 package 內訪問
    protected double radius3;
    private double radius2;

    public Circle() {
    }

    // function
    // methods are usually public

    public double getArea() {
        return Math.PI * Math.pow(this.radius2, 2);
    }

}
