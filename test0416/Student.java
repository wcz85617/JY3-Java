package com.stusystem.tt;

public class Student {
	public Student(int id, String stuName, char Sex, short age, String grade, String sutAddress, int stuTel, String stuEmail)
	{
		this.id = id;
		this.stuName = stuName;
		this.sex = sex;
		this.age = age;
		this.grade= grade;
		this.sutAddress = sutAddress;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", sutAddress=" + sutAddress + ", stuTel=" + stuTel + ", stuEmail=" + stuEmail + "]";
	}

	int id;
	String stuName;
	char sex;
	short age;
	String grade;
	String sutAddress;
	int stuTel;
	String stuEmail;

}
