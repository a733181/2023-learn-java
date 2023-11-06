package example;

/**
 * Person
 */
public class Person {

    private String name;
    private Nationality homeland;

    /**
     * This constructor instantiates a person by name and nationality
     *
     * @param n person name
     * @param h person homeland
     */
    public Person(String n, Nationality h) {
        name = n;
        homeland = h;
    }

    /**
     * get Person Name
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
