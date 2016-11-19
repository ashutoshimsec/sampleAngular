package com.ashu.angular.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable{
 
	private static final long serialVersionUID = 1L;
private String Name;
private int Age;

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}


@Override
public String toString() {
	return "Employee [Name=" + Name + ", Age=" + Age + "]";
}
 
 
}
