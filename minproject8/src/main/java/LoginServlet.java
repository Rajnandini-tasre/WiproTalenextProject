

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name  = request.getParameter("name");
		String password = request.getParameter("password");
		if(password.equals("admin")) {
			p.print("uou are successfully login in");
			p.print("<br> Welcome "+name);
			Cookie c = new Cookie("name",name);
			response.addCookie(c);			
		}
		else {
			p.print("sorry , username or password error");
			request.getRequestDispatcher("login.html").include(request, response);
			
		}
		p.close();
	}

}
