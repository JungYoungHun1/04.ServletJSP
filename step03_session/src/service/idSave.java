package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/save")
public class idSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public idSave() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("save servlet");
		
		// step02 session
		HttpSession session2 = request.getSession();
		System.out.println("IdSave  -  " + session2.getId());
		
		response.sendRedirect("sessionFinal");
		
		
		/*
		Cookie cookie3 = new Cookie("myName", "영훈");
		cookie3.setMaxAge(60*60*24);
		response.addCookie(cookie3);
		
		response.sendRedirect("final");
*/
	}
		
}
