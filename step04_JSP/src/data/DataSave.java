package data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/save")
public class DataSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DataSave() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cookie »ý¼º -> jsp02_EL.jsp 
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Cookie cookie = new Cookie("jsp", "hello");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		
		response.sendRedirect("jsp02_EL.jsp");
					
					
					
	}

}
