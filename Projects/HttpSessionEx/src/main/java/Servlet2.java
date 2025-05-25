import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Session Example</h1>");
		out.print("<hr>");
		out.print("<p>This is Servlet 2</p>");
		HttpSession session=request.getSession();
		out.print("<p>X: "+session.getAttribute("x")+"</p>");
		out.print("<p>C: "+session.getAttribute("c")+"</p>");
		out.print("<p>Bye Servlet 2</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
