package com.miniproj.a4.crimems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "felony")
public class Felony {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name ="Age")
	private int age;
	
	@Column(name="Felony_Committed")
	private String felony_committed;
	
	@Column(name ="Date_of_incident")
	private String date;
	
	@Column(name ="Time_of_incident")
	private String time;
	
	@Column(name = "Description")
	private String desc;

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

	public String getFelony_committed() {
		return felony_committed;
	}

	public void setFelony_committed(String felony_committed) {
		this.felony_committed = felony_committed;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Felony [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", felony_committed=" + felony_committed + ", date=" + date + ", time=" + time + ", desc=" + desc
				+ "]";
	}
	
	
}
