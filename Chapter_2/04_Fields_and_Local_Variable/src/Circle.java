public class Circle {
    private double radius;
    private int i; // i 的作用域 整個 class Circle

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public void setI() {
        // i1 的 作用域只在 function 裡面
        int i1 = 100;
        i = 100;
    }

    public int getI() {
        return i;
    }
}
