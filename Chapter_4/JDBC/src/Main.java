import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassCastException {
        Dev dev = new Dev();
        dev.getDev();
        String sql_statement = "Select * from video";
        Connection c = DriverManager.getConnection(dev.getUrl(), dev.getUserName(), dev.getUserPassword());
        if (c != null) {
            System.out.println("get database");
        } else {
            System.out.println("Cannot connect to the database");
        }
        PreparedStatement pps = c.prepareStatement(sql_statement);
        ResultSet res = pps.executeQuery();
        ArrayList<Video> resData = new ArrayList<>();
        while (res.next()) {
            Video v = new Video(Integer.parseInt(res.getString("videoId")), res.getString("name"), Integer.parseInt(res.getString("price")));
            resData.add(v);
        }
        for (Video v : resData) {
            System.out.println(v.get());
        }
        c.close();
    }
}
