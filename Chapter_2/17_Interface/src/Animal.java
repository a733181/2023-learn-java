public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public void sleep() {
        System.out.println("This" + animalType + "is Sleeping...");
    }

    public abstract void makeSound();
}
