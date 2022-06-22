package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InvalidView
 */
@WebServlet("/invalid")
public class InvalidView extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public InvalidView() {
        super();
    }
    // sessionFinal 에 있는 로그아웃 버튼 클릭 했을 때 -> 현재의 서블릿에서 세션 종료
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("lecture"));
		session.invalidate();
		session = null;
//		System.out.println(session.getAttribute("lecture")); // 오류 남 ㅋㅋ
		
		response.sendRedirect("login.html");
//		PrintWriter out = response.getWriter();
//		out.println(session.getAttribute("lecture"));
	}

}
