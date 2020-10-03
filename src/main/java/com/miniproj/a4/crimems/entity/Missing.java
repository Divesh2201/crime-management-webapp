package com.miniproj.a4.crimems.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "missing")
public class Missing {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "last_seen")
	private String last_seen;
	
	@Column(name = "dob")
	private String dob;

	@Column(name = "contact_number")
	private String contact_number;


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getLast_seen() {
		return last_seen;
	}



	public void setLast_seen(String last_seen) {
		this.last_seen = last_seen;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getContact_number() {
		return contact_number;
	}



	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}



	@Override
	public String toString() {
		return "Missing [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", last_seen=" + last_seen + ", dob=" + dob + ", contact_number=" + contact_number + "]";
	}



	
	
}

