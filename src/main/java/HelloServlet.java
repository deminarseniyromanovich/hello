import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();

        writer.println("3) Have a good day!");
        writer.println("2) Have a good day!");
        writer.println("1) Have a good day!");

        writer.println();

        writer.println("1) Have a good day!");
        writer.println("2) Have a good day!");
        writer.println("3) Have a good day!");
    }
}
