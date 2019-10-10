package com.vikram.bishwajit.student;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Bishwajit.
 *
 */
@Entity
public class Student {
	@Id
	private String id;
	private String name;
	private String grade;

	public Student() {
		// Default Constructor.
	}

	public Student(String id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
