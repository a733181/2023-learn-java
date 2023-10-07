import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        People s1 = new Student("Tom1", 20, "Address", "09123456780", 20);
        People t1 = new Teacher("Tom2", 20, "Address", "09123456780", "Math");
        // array
        Student[] students = new Student[10];
        Teacher[] teachers = new Teacher[10];
        People[] peoples = new People[10];
        peoples[0] = s1;
        peoples[1] = t1;

        for (int i = 0; i < 2; i++) {
            System.out.println(peoples[i].name);
        }

        ArrayList<People> peopleArrayList = new ArrayList<>();
        peopleArrayList.add(s1);
        peopleArrayList.add(t1);
    }
}
