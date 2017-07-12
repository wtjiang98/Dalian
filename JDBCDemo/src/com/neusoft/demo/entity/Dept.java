package com.neusoft.demo.entity;

public class Dept {

	private int deptNo;
	private String deptName;
	private String loc;
	
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptNo, String deptName, String loc) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + ", loc="
				+ loc + "]";
	}
	
	
}
