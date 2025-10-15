import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestParameterServlet")
public class RequestParameterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Request Parameters</title></head>");
        out.println("<body>");
        out.println("<h2>All Request Parameters</h2>");

        Enumeration<String> paramNames = request.getParameterNames();

        if (!paramNames.hasMoreElements()) {
            out.println("<p>No parameters found.</p>");
        } else {
            out.println("<table border='1' cellpadding='5'>");
            out.println("<tr><th>Parameter Name</th><th>Parameter Value(s)</th></tr>");
            
            while (paramNames.hasMoreElements()) {
                String paramName = paramNames.nextElement();
                String[] paramValues = request.getParameterValues(paramName);
                StringBuilder values = new StringBuilder();
                for (int i = 0; i < paramValues.length; i++) {
                    values.append(paramValues[i]);
                    if (i < paramValues.length - 1) values.append(", ");
                }
                out.println("<tr><td>" + paramName + "</td><td>" + values + "</td></tr>");
            }
            
            out.println("</table>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
