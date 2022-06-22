package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class idCheck
 */
@WebServlet("/check")
public class idCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public idCheck() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("uname");
		String pw = request.getParameter("psw");
		System.out.println(id);
		System.out.println(pw);
//		PrintWriter out = response.getWriter();
		
		if("busan".equals(id)) {
			// valid 매핑 되어 있는 servlet 화면 이동
			response.sendRedirect("valid");
//			request.getRequestDispatcher("valid").forward(request, response);
			
		}else {
			response.sendRedirect("invalid");

//			request.getRequestDispatcher("invalid").forward(request, response);
		}
		
//		out.println(id);
//		out.println(pw);
	}

}
