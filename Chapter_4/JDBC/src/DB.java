import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DB {


    private String url;
    private String userName;
    private String userPassword;

    public void getDB() {
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

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
