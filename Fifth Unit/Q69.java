import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Servlet annotation to define URL pattern
@WebServlet("/welcome")
public class Q69 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the content type of response
        response.setContentType("text/html");

        // Get the writer to write the response
        PrintWriter out = response.getWriter();

        // Get data from request (URL parameter)
        String name = request.getParameter("name");

        // Write HTML response
        out.println("<html><body>");
        out.println("<h2>Welcome to My First Servlet!</h2>");

        if (name != null && !name.isEmpty()) {
            out.println("<h3>Hello, " + name + "!</h3>");
        } else {
            out.println("<h3>Hello, Guest!</h3>");
        }

        out.println("</body></html>");
    }
}
