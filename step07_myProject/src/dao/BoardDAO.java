package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

import dto.DeptDTO;
import dto.EmpDTO;
import util.DBUtil;

public class BoardDAO {
	public static List<DeptDTO> listboard(){
		List<DeptDTO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from dept";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setLoc(rset.getString("loc"));
				dto.setDeptno(rset.getInt("deptno"));
				dto.setDname(rset.getString("dname"));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return list;
	}
	public static List<EmpDTO> selectList(DeptDTO param){
		List<EmpDTO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select A.ename, A.deptno from emp A INNER JOIN dept B ON A.deptno = B.deptno where B.loc = ? ";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, param.getLoc());
			rset = pstmt.executeQuery();
			while(rset.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rset.getString("ename"));
				dto.setDeptno(rset.getInt("deptno"));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return list;
	}
	
	public static int insertBoard(EmpDTO param) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "insert into emp(empno, ename, deptno) values(?, ?, ?);";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, param.getEmpno());
			pstmt.setString(2, param.getEname());
			pstmt.setInt(3, param.getDeptno());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return 0;
	}
	
	public static int detailDeptno(String param) {
		DeptDTO dto = new DeptDTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select deptno from dept where loc =?";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, param);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				dto.setDeptno(rset.getInt("deptno"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return dto.getDeptno();
	}
	
//	public static List<EmpDTO> selectBoard(EmpDTO param){
//		List<EmpDTO> list = new ArrayList<>();
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		String sql = "select * from emp where deptno = ?";
//		try {
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, param.getDeptno());
//			rset = pstmt.executeQuery();
//			while(rset.next()) {
//				EmpDTO dto = new EmpDTO();
//				dto.setDeptno(rset.getInt("deptno"));
//				dto.setEmpno(rset.getInt("empno"));
//				dto.setEname(rset.getString("ename"));
//				list.add(dto);
//				
//			}
//			System.out.println(list);
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}finally {
//			DBUtil.close(rset, pstmt, conn);
//		}
//		return list;
//	}
	
	
}
