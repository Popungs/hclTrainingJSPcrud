package com.bean;

public class User {
private int id;
private String name,password,email,sex,country,department;
private long income;
public int getId() {
	return id;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public long getIncome() {
	return income;
}
public void setIncome(long income) {
	this.income = income;
}
@Override
public String toString() {
	return "User id : " + id + ", name : " + name + ", password: " + password + ", email: " + email + ", sex: " + sex
			+ ", country: " + country + ", department: " + department + ", income: " + income;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
