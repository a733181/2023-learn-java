public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(0);
        try {
            c1.setRadius(-1);
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            System.out.println("radius not set");
        }
    }
}
