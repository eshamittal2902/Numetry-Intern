package com.esha;

public class Student {
	private int stuId;
	private String stuName;
	private String stuPhn;
	private String stuCity;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPhn() {
		return stuPhn;
	}
	public void setStuPhn(String stuPhn) {
		this.stuPhn = stuPhn;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	
	public Student(int stuId, String stuName, String stuPhn, String stuCity) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPhn = stuPhn;
		this.stuCity = stuCity;
	}
	public Student(String stuName, String stuPhn, String stuCity) {
		super();
		this.stuName = stuName;
		this.stuPhn = stuPhn;
		this.stuCity = stuCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuPhn=" + stuPhn + ", stuCity=" + stuCity + "]";
	}
	
	
	
}
