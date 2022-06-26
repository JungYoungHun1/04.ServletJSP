package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import model.EmpDAO;


@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmpController() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		// 메소드 정의
		/* step01 : 데이터 획득
		 * empno 사번 -> ename 사원의 이름을 반환받으려고 합니다!
		 * String ename = EmpDAO.getName(empno)
		 * 
		 * step02 : 페이지 이동(forward vs redirect)
		 * ename이 있다고 한다면 -> view.jsp 이름값을 전달
		 * ename이 없다고 한다면 -> view.jsp 사원의 이름이 없습니다.
		 * 만약 SQLExecption이 발생한다면 -> failView.jsp 로 이동
		 * 
		 * */
		
		try {
			String ename = EmpDAO.getName(empno);
			if(ename != null) {
				HttpSession session = request.getSession();
				session.setAttribute("ename", ename);
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("ename", "이름이 없습니다.");
			}
			request.getRequestDispatcher("view.jsp").forward(request, response);

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("failView.jsp");
		}
		
	}

}
