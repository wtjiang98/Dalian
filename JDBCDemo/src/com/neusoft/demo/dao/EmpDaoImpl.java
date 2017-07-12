package com.neusoft.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.demo.entity.Dept;
import com.neusoft.demo.entity.Emp;

public class EmpDaoImpl implements EmpDao{

	@Override
	public void insertEmp(Emp emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Emp> selectAllEmps() {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Emp> emps = new ArrayList<Emp>();
		String sql = "select * from emp e  left join dept d on(e.deptno = d.deptno)";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String hiredate = rs.getString(5);
				int mgr = rs.getInt(4);
				float sal = rs.getFloat(6);
				float comm = rs.getFloat(7);
				int deptno = rs.getInt(8);
				String deptname = rs.getString(9);
				String loc = rs.getString(10);
				
				Dept d = new Dept(deptno,deptname,loc);
				Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,d);
				
				emps.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(rs, ps, conn);
		}
		return emps;
	}

	@Override
	public void deleteEmp(int empno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmp(int empno, String src, Object srcValue, String tar,
			Object tarValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Emp selectEmp(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

}
