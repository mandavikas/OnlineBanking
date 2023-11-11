package com.icic;

public class user {

	private int empno;
	private String name;
	private int sal;
	
	
	public user(int empno, String name, int sal) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "user [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public user()
	{
		
	}
	
}
