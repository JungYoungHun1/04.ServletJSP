package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Final() {
        super();
    }

    // Client에 있는 Cookie 정보 획득 - 해당 서비스에서 발생시킨 쿠키 정보에 한해서만 획득
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// myId, myAge, myName으로 지정되어 있는 모든 쿠키 출력
		Cookie[] cookies = request.getCookies();
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getValue());
//		}
		
		//myName 삭제
		Cookie cookies2 = new Cookie("myName", "");
		cookies2.setMaxAge(0);
		response.addCookie(cookies2);
		
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getValue());
//		}
		
		System.out.println(cookies2.getValue());
		
	
		
	
		
	}

}
