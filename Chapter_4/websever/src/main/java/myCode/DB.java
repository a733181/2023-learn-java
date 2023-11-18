package myCode;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {


    private String url;
    private String userName;
    private String userPassword;
    private Connection c;

    private void getDB() {
        try (InputStream input = DB.class.getClassLoader().getResourceAsStream("dev.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find dev.properties");
                return;
            }

            Properties properties = new Properties();
            properties.load(input);

            String databaseUrl = properties.getProperty("database.url");
            String databaseUsername = properties.getProperty("database.username");
            String databasePassword = properties.getProperty("database.password");

            url = databaseUrl;
            userName = databaseUsername;
            userPassword = databasePassword;
        } catch (IOException e) {
            // 处理文件读取异常
            e.printStackTrace();
        } catch (Exception e) {
            // 处理其他异常
            e.printStackTrace();
        }
    }

    public void initializeDB() throws SQLException, ClassNotFoundException {
        getDB();
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(url, userName, userPassword);
        System.out.println(userName);
        if (c != null) {
            System.out.println("open database");
        } else {
            System.out.println("Cannot connect to the database");
        }
    }

    public void closeDB() throws SQLException {
        c.close();
    }

    public Connection getC() {
        return c;
    }
}
