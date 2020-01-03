package com.hqyj.mybatis.entity;
/*
 * 
 * 实体类的属性和数据库中的表student表的字段名完全一样。
 * 属性提供get/set方法
 *
 */
public class Student {
	private int stu_id;
	private String stu_name;
	private Integer stu_age;
	private int stu_sex;
	private int  cls_id;

	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public Integer getStu_age() {
		return stu_age;
	}
	public void setStu_age(Integer stu_age) {
		this.stu_age = stu_age;
	}
	public int getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(int stu_sex) {
		this.stu_sex = stu_sex;
	}
	public int getCls_id() {
		return cls_id;
	}
	public void setCls_id(int cls_id) {
		this.cls_id = cls_id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_age=" + stu_age + ", stu_sex=" + stu_sex
				+ ", cls_id=" + cls_id + "]";
	}
	
	
}
