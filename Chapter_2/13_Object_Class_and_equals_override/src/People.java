public class People {
    protected String name;
    protected int age;
    protected String address;
    protected String phone;

    // method overloading ( default constructor )
    public People() {
        this.name = "NO SET NAME";
        this.age = 0;
        this.address = "ADDRESS";
        this.phone = "00000000";
    }

    public People(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void soutBasic() {
        System.out.print("name " + name);
        System.out.println(" age " + age);
    }

    public void sayHello() {
        System.out.println(name + " Hello");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof People) {
            People p1 = (People) o;
            return this.age == p1.age;
        }
        return false;
    }
}
