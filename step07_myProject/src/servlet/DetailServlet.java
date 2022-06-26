package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.Select;

import dao.BoardDAO;
import dto.DeptDTO;
import dto.EmpDTO;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptDTO dto = new DeptDTO();
//		dto.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		dto.setLoc(request.getParameter("loc"));
		int result = BoardDAO.detailDeptno(dto.getLoc());
//		System.out.println(result);
		dto.setDeptno(result);
		

		request.setAttribute("detail", BoardDAO.selectList(dto));
		request.setAttribute("deptno", result);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
	}

}
