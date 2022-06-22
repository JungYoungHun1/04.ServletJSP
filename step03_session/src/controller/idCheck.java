package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/check")
public class idCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public idCheck() {
        super();
    }

	// 추출한 id값이 있다면 -> 쿠키 생성 365일 저장 시간 설정 -> Client : id 값을 따로 저장 하여 -> /save redirect로 이동
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("uname");
//		System.out.println(id);
		
		HttpSession session1 = request.getSession();
		System.out.println("idCheck  -  " + session1.getId());
		session1.setAttribute("lecture", "Web Study");
		
		response.sendRedirect("save");
		
		
		/* 쿠키
		if(id != null && id.length() != 0) {
			// 쿠키 생성
			Cookie cookie1 = new Cookie("myId", id);
			Cookie cookie2 = new Cookie("myAge", "25");
			
			// 쿠키 잔존 시간 설정
			cookie1.setMaxAge(60*60*24*365);
			cookie2.setMaxAge(60*60*24*365);
			
			// Client에게 전송 및 저장
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			response.sendRedirect("save");
			
			
		}
		*/
	}

}
