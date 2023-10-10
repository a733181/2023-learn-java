public class Chicken extends Animal implements Edible {
    public Chicken() {
        super("chicken");
    }

    @Override
    public void makeSound() {
        System.out.println("chicken sound");
    }

    @Override
    public String howToEat() {
        return "chicken";
    }
}
