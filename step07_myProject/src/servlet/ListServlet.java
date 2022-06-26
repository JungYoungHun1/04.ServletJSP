package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dto.DeptDTO;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", BoardDAO.listboard());
//		System.out.println(BoardDAO.listboard().get(1).getDeptno());
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
//		DeptDTO dto = new DeptDTO();
		
	}

}
