package firstWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * http://localhost:8080/firstWeb/login?name=scott&pass=tiger&submit=Login
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("User name = "+request.getParameter("name") +" Pass word = "+request.getParameter("pass"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * TODO if name and pass is wrong show the login page again with msg...
	 * if name is less than 4 chars then add msg and login page
	 * if pass is less than 8 chars then add msg and login page
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if("scott".equals(name) && "tiger".equals(pass))	{
			request.setAttribute("message", "Hi Scott.. how have you been");
		}	else	{
			request.setAttribute("message", "Only Scott is a Valid User");
		}
		request.getRequestDispatcher("loginresults.jsp").forward(request, response);
	}

}





