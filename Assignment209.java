import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayCookiesServlet")
public class DisplayCookiesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Cookies Available</title></head><body>");
        out.println("<h2>Cookies Available for this Application</h2>");

        Cookie[] cookies = request.getCookies();

        if (cookies == null || cookies.length == 0) {
            out.println("<p>No cookies available.</p>");
        } else {
            out.println("<table border='1' cellpadding='5'>");
            out.println("<tr><th>Cookie Name</th><th>Cookie Value</th><th>Max Age (seconds)</th></tr>");
            for (Cookie cookie : cookies) {
                out.println("<tr>");
                out.println("<td>" + cookie.getName() + "</td>");
                out.println("<td>" + cookie.getValue() + "</td>");
                out.println("<td>" + cookie.getMaxAge() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
