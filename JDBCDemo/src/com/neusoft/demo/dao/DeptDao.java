package com.neusoft.demo.dao;

import java.util.List;

import com.neusoft.demo.entity.Dept;

public interface DeptDao {

	public void deleteDept(int deptId);
	public List<Dept> selectAllDepts();
	public void insertDept(Dept d);
	public void updateDept(Dept d);
}
