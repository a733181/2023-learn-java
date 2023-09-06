import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String friend1 = "Mike1";
        String friend2 = "Mike2";
        String friend3 = "Mike3";

        String[] friend = {"Mike1", "Mike2", "Mike3"};
        System.out.println(friend);
        System.out.println(friend[0]);
        System.out.println(friend.length);

        // Array
        String[] friends = new String[3];
        friends[0] = "Mike1";
        friends[1] = "Mike1";
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);

        // ArrayList
        ArrayList<String> frindeList = new ArrayList<>();
        frindeList.add("A");
        frindeList.add("D");
        frindeList.add("E");
        frindeList.add("B");
        System.out.println(frindeList);
        System.out.println(frindeList.size());
        System.out.println(frindeList.get(1));
        Collections.sort(frindeList);
        System.out.println(frindeList);

        frindeList.clear();
        System.out.println(frindeList);
    }
}
