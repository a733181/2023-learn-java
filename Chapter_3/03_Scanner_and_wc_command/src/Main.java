import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("FileName: ");
        File f = new File(fileName);

        int line_count = 0;
        int word_count = 0;
        int chart_count = 0;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                line_count++;
                String line = sc.nextLine();
                String[] line_arr = line.split(" ");
                for (String word : line_arr) {
                    word_count++;
                }
                chart_count += line.length();
            }
            sc.close();
            System.out.println(line_count);
            System.out.println(word_count);
            System.out.println(chart_count);
        } catch (FileNotFoundException e) {
            System.out.println(f + " not find");
            throw new RuntimeException(e);
        }
    }
}
