package club.banyuan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sum")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer a = Integer.valueOf(req.getParameter("a"));
        Integer b = Integer.valueOf(req.getParameter("b"));
        resp.getWriter().println("a + b = "+(a+b));
        resp.getWriter().println("a - b = "+(a-b));
        resp.getWriter().println("a * b = "+a*b);
        resp.getWriter().println("a / b = "+a/b);
    }
}
