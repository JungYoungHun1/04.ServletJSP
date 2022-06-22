package step02.apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class printServlet
 */
@WebServlet("/VIEWS/print")
public class printServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public printServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
//		System.out.println(request.getQueryString());
		System.out.println(URLDecoder.decode(request.getQueryString(), "UTF-8"));
//		String result[] = request.getParameterValues("like");
//		PrintWriter out = response.getWriter();
//		
//		for (int i = 0; i < result.length; i++) {
//			out.println(result[i]);
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		ServletInputStream input = request.getInputStream();
		System.out.println(input);
		
		int length = request.getContentLength();
		byte[] data = new byte[length];
		input.readLine(data, 0, length);
		String string = new String(data);
		System.out.println(string);
		System.out.println(URLDecoder.decode(string, "UTF-8"));
//		String result[] = request.getParameterValues("like");
//		PrintWriter out = response.getWriter();
//		
//		for (int i = 0; i < result.length; i++) {
//			out.println(result[i]);
//		}
	}

}
