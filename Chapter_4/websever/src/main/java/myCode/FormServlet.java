package myCode;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "FormServlet", value = "/form-servlet")
public class FormServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String price = request.getParameter("price");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + "name" + name + "</p>");
        out.println("<p>" + "price" + price + "</p>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String price = request.getParameter("price");

        try {
            insertDB(name, price);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + "name" + name + "</p>");
        out.println("<p>" + "price" + price + "</p>");
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
