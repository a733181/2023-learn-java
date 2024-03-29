package myCode;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "tryServlet", value = "/try-servlet")
public class TryServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Try!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
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
