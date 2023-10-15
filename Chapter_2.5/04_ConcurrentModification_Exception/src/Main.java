import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        int tempRemove = -1;
        for (int k : arr) {
            if (k == 5) {
//                arr.remove(k);
                tempRemove = k;
            }
        }
        arr.remove(tempRemove);
    }
}
