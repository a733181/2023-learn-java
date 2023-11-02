import javax.swing.*;

public class Main {

    int age;
    String ageString;

    public Main() {
        ageString = JOptionPane.showInputDialog("What is your age?");
        try {
            age = Integer.parseInt(ageString);
            if (age <= 18) {
                System.out.println("Can't drive carts");
            } else {
                System.out.println("You can drive");
            }
        } catch (NumberFormatException n) {
            n.printStackTrace();
            System.out.println("Not Number");
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
