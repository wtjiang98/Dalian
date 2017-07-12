package com.neusoft.demo.dao;

import java.util.List;

import com.neusoft.demo.entity.Emp;

public interface EmpDao {

	public void  insertEmp(Emp emp);
	public void deleteEmp(int empno);
	public void updateEmp(int empno, String src, Object srcValue, String tar,  Object tarValue);
	public Emp selectEmp(int empno);
	public List<Emp> selectAllEmps();
}
