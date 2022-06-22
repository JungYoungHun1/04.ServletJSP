package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class variable
 */
@WebServlet("/var")
public class variable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public variable() {
        super();
        // TODO Auto-generated constructor stub
    }
    
//    String msg;
    // 서블릿에서는 전역 변수 사용하지 말것

	// 프로젝트에 /var?msg=""
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int number = 0;
		String msg = request.getParameter("msg");
//		msg = request.getParameter("msg");

		
		PrintWriter out = response.getWriter();
		out.println("<html><head>Variable Test</head>");
		out.println("<body><h2>Result</h2>");
		while (number++ < 10) {
			out.print(msg + " : " + number +"<br/>");
			out.flush();
			System.out.println(msg + " : " + number);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.println("</body></html>");
		out.close();
	}

}
