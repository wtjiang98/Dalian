package com.neusoft.demo.entity;

public class Emp {

	private int empNo;
	private String empName;
	private String job;
	private int managerNo;
	private String hireDate;
	private float salary;
	private float comm;
	private Dept dept;

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", job=" + job
				+ ", managerNo=" + managerNo + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", comm=" + comm + ", dept=" + dept
				+ "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empNo, String empName, String job, int managerNo,
			String hireDate, float salary, float comm, Dept dept) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.salary = salary;
		this.comm = comm;
		this.dept = dept;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getManagerNo() {
		return managerNo;
	}

	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

}
