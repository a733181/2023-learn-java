package myCode;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import video.Video;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "SessionServlet", value = "/session-servlet")
public class SessionServlet extends HttpServlet {

    private PreparedStatement preparedStatement;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String price = request.getParameter("price");

        Video video = new Video();
        video.setName(name);
        video.setPrice(Integer.parseInt(price));
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("video", video);


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + "name" + name + "</p>");
        out.println("<p>" + "price" + price + "</p>");
        out.println("</body></html>");
        out.println("<form method=\"post\" action=\"http://localhost:8080/session-servlet\">");
        out.println("<input type=\"submit\" value=\"confirm\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = null;
        String price = null;

        HttpSession httpSession = request.getSession();
        Video video = (Video) httpSession.getAttribute("video");


//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie : cookies) {
//            if (cookie.getName().equals("name")) {
//                name = cookie.getValue();
//            } else if (cookie.getName().equals("price")) {
//                price = cookie.getValue();
//            }
//        }

        try {
            insertDB(video.getName(), video.getName());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + "name" + name + "</p>");
        out.println("<p>" + "price" + price + "</p>");
        out.println("<p>" + "OK" + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

    private void insertDB(String name, String price) throws SQLException, ClassNotFoundException {
        DB db = new DB();
        db.initializeDB();
        Connection c = db.getC();
        try (PreparedStatement pre = c.prepareStatement("insert into video" + "(videoId, name, price) values (null, ?, ?)")) {
            pre.setString(1, name);
            pre.setString(2, price);

            int rowsAffected = pre.executeUpdate();
            System.out.println(rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeDB();
        }
    }
}
