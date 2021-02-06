package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
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
		PrintWriter out=response.getWriter();
		String value=request.getParameter("Shopping-Websites");
	
		
		if(value.equals("Ajio")) {
			response.sendRedirect("https://www.ajio.com/shop/women");
		}
		else if(value.equals("Myntra")) {
			response.sendRedirect("https://www.myntra.com/");
		}
		else if(value.equals("SSS")) {
			response.sendRedirect("https://streetstylestore.com/index.php?");
		}
		else if(value.equals("Max")) {
			response.sendRedirect("https://www.maxfashion.in/in/en/department/maxwomen");
		}
		else if(value.equals("Amazon")) {
			
			response.sendRedirect("https://www.amazon.com/");
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
