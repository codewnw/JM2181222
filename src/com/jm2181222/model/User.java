package com.jm2181222.model;

import java.util.Arrays;

public class User {

	private String name;

	public User(String name, int age, String email, String gender, String[] courses, String country, String feedback) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.courses = courses;
		this.country = country;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "User [Atul=" + name + ", age=" + age + ", email=" + email + ", gender=" + gender + ", courses="
				+ Arrays.toString(courses) + ", country=" + country + ", feedback=" + feedback + "]";
	}

	private int age;

	private String email;

	private String gender;

	private String[] courses;

	private String country;

	private String feedback;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
