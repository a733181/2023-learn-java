package myCode;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import video.Video;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "FindVideo", value = "/findVideo")
public class FindVideo extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("video-id");

        try {
            // 資料庫連接
            DB db = new DB();
            db.initializeDB();
            Connection c = db.getC();

            // 建立 PreparedStatement 對象並設置參數
            PreparedStatement pre = c.prepareStatement("select * from video where videoId = ?");
            pre.setString(1, id);

            // 執行查詢
            ResultSet res = pre.executeQuery();

            Video video = null;
            if (res.next()) {
                video = new Video();
                video.setId(res.getInt("videoId"));
                video.setName(res.getString("name"));
                video.setPrice(res.getInt("price"));
            }

            // 關閉結果集和 PreparedStatement
            res.close();
            pre.close();

            // 關閉資料庫連接
            db.closeDB();

            // 設置屬性並轉發到 JSP 頁面
            request.setAttribute("video", video);
            request.getRequestDispatcher("/video.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException | ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }

}
