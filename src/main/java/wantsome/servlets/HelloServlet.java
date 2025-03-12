package wantsome.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init config for servlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello World</h1>");
        out.println("</body></html>");
    }

    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("</body></html>");
    }*/

    @Override
    public void destroy() {
        System.out.println("Destroy config for servlet");
    }
}
