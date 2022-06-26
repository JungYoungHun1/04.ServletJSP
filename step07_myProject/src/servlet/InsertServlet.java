package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dto.DeptDTO;
import dto.EmpDTO;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDTO dto = new EmpDTO();
//		dto.setDeptno(Integer.parseInt(request.getParameter("deptno")));
//		dto.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		dto.setEmpno(5556);
		dto.setEname(request.getParameter("ename"));
		dto.setDeptno(Integer.parseInt(request.getParameter("deptno")));
//		dto.setDeptno(BoardDAO.detailDeptno(request.getParameter("ename")));
//		System.out.println(dto.getDeptno());

		int result = BoardDAO.insertBoard(dto);
//		request.getRequestDispatcher("insert.jsp").forward(request, response);
		switch (result) {
		case 1:
			System.out.println("등록 성공");
			break;
		case 0:
            System.out.println("등록 실패");			
			break;
		}
		response.sendRedirect("list");

		

	}

}
