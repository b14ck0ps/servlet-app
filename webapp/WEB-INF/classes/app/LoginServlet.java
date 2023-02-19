package app;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Welcome to " + getServletContext().getInitParameter("appname") + "</h1>");
        printWriter.println("<h1>This is a Login page.</h1>");
        printWriter.println("<form method='post'>");
        printWriter.println("<label>Username:</label>");
        printWriter.println("<input type='text' name='username'>");
        printWriter.println("<label>Password:</label>");
        printWriter.println("<input type='text' name='password'>");
        printWriter.println("<input type='submit' value='Login'>");
        printWriter.println("</form>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
