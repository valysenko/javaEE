package com.lysenko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LOGIN = "vlad";
	private static final String PASSWORD = "password";

	private static StringBuilder getForm() {
		StringBuilder sb = new StringBuilder();
		sb.append("<form method=\"post\">");
		sb.append("Input your data");
		sb.append("<br>");
		sb.append("<label>    <pre>Login    </pre><input type=\"text\" name=\"login\"></label>");
		sb.append("<br><label><pre>Password </pre><input type=\"password\" name=\"password\"></label>");
		sb.append("<br><input type = \"submit\" value=\"Ok\">" + "</form>");
		return sb;
	}

	private static void getPage(PrintWriter out, boolean flag){
		
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>First</title>");
			out.println("</head>");
			out.println("<body>");
			if (flag)
				out.println("<p>Congretulations</p>");
			else{
				out.println(getForm());
			}
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();	
		getPage(out, false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String log = request.getParameter("login");
		String pa = request.getParameter("password");
		boolean flag = (log.equals(LOGIN) && pa.equals(PASSWORD));
		PrintWriter out = response.getWriter();
		getPage(out, flag);
	}

}
