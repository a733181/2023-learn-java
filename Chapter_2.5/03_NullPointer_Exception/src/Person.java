public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println("My name is " + name);
        System.out.println(spouse);
        if (spouse != null) {
            System.out.println("My spouse is " + spouse.getName());

        }
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName() {
        return this.name;
    }
}
