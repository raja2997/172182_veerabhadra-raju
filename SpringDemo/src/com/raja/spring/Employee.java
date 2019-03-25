package com.raja.spring;

public class Employee {
String name;
String dept;
int salary=0;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public void getEmployee()
{
	System.out.println("Employee name is"+" "+this.name);
	System.out.println("The employee department"+" "+this.dept);
	System.out.println("Salary is"+" "+this.salary);
}
}
