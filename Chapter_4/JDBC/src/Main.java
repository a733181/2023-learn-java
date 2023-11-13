import javax.swing.*;
import java.sql.*;

public class Main {
    private static Connection c;

    public static void main(String[] args) throws SQLException, ClassCastException {
        initializeDB();
        String name = JOptionPane.showInputDialog("Find a video by name");
        String sql_statement = "Select * from video where name = ? ;";
        PreparedStatement pps = c.prepareStatement(sql_statement);
        pps.setString(1, name);
        ResultSet res = pps.executeQuery();
        if (res.next()) {
            int vid = Integer.parseInt(res.getString("videoId"));
            String vname = res.getString("name");
            int vprice = Integer.parseInt(res.getString("price"));
            JOptionPane.showMessageDialog(null, new Video(vid, vname, vprice).get());
        } else {
            JOptionPane.showMessageDialog(null, "video not find");
        }
        closeDB();
    }

    private static void initializeDB() throws SQLException {
        DB db = new DB();
        db.getDB();
        c = DriverManager.getConnection(db.getUrl(), db.getUserName(), db.getUserPassword());
        if (c != null) {
            System.out.println("get database");
        } else {
            System.out.println("Cannot connect to the database");
        }
    }

    private static void closeDB() throws SQLException {
        c.close();
    }
}
