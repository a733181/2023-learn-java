public class People1 {
    protected String name;
    protected int age;
    protected String address;
    protected String phone;

    public People1(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void soutBasic() {
        System.out.print("name " + name);
        System.out.println(" age " + age);
    }
}
