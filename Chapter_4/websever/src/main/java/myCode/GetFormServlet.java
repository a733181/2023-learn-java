package myCode;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getFormServlet", value = "/get-form-servlet")
public class GetFormServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String bookName = request.getParameter("name");
        String bookPrice = request.getParameter("price");
        String bookAuthro = request.getParameter("authro");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + "BookName" + bookName + "</p>");
        out.println("<p>" + "bookPrice" + bookPrice + "</p>");
        out.println("<p>" + "bookAuthro" + bookAuthro + "</p>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Handle POST requests here, if needed
        // You can access request parameters using request.getParameter("parameterName")

        response.setContentType("text/html");

        // Hello from POST
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello from POST!</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
