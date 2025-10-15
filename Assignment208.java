import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstTimeVisitorServlet")
public class FirstTimeVisitorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        boolean firstTime = true;

        // Check for existing cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("visited".equals(cookie.getName())) {
                    firstTime = false;
                    break;
                }
            }
        }

        // If first-time visitor, set a cookie
        if (firstTime) {
            Cookie visitCookie = new Cookie("visited", "yes");
            visitCookie.setMaxAge(60*60*24*365); // 1 year
            response.addCookie(visitCookie);
            out.println("<h2>Welcome! You are visiting for the first time.</h2>");
        } else {
            out.println("<h2>Welcome back! You have visited this site before.</h2>");
        }

        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
