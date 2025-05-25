import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("x",10);
		session.setAttribute("c","Incapp");
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Session Example</h1>");
		out.print("<hr>");
		out.print("<p>This is Servlet 1</p>");
		out.print("<p>Bye Servlet 1</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
