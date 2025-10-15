import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTrackingServlet")
public class SessionTrackingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Create or retrieve the session
        HttpSession session = request.getSession(true);

        // Retrieve visit count
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount += 1;
        }
        session.setAttribute("visitCount", visitCount);

        out.println("<html><head><title>Session Tracking</title></head><body>");
        out.println("<h2>Session Tracking Information</h2>");

        out.println("<p><strong>Number of visits:</strong> " + visitCount + "</p>");
        out.println("<p><strong>Session ID:</strong> " + session.getId() + "</p>");
        out.println("<p><strong>Session Creation Time:</strong> " + sdf.format(session.getCreationTime()) + "</p>");
        out.println("<p><strong>Last Accessed Time:</strong> " + sdf.format(session.getLastAccessedTime()) + "</p>");
        out.println("<p><strong>Max Inactive Interval (seconds):</strong> " + session.getMaxInactiveInterval() + "</p>");
        out.println("<p><strong>Is New Session:</strong> " + session.isNew() + "</p>");

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
