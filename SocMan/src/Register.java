import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */

	public Register() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		String birth_date = request.getParameter("birth_date");
		String flat_date = request.getParameter("flat_date");
		String block = request.getParameter("block");
		String flatno = request.getParameter("flatno");
		String mobile = request.getParameter("mobile");

		User user = new User(fname, lname, email, password, birth_date, flat_date, block, flatno, mobile);
		Database db = new Database();
		if (password.equals(cpassword)) {
			String result = db.insert(user);
			response.getWriter().print(result);
			response.getWriter().print("-----------");
			PrintWriter out = response.getWriter();
			out.print("<a href='/SocMan/UserLogin.jsp'>Login</a>");
		} else {
			String result = "Password and Confirm Password Does not match !!";
			response.getWriter().print(result);
			response.getWriter().print("-----------");
			PrintWriter out = response.getWriter();
			out.print("<a href='/SocMan/UserRegister.jsp'>Registration</a>");
		}

	}

}
