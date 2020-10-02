package com.miniproj.a4.crimems.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "criminal")
public class Criminal {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "crime_committed")
	private String crime_committed;
	
	@Column(name = "prison_term")
	private int prison_term;

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCrime_committed() {
		return crime_committed;
	}

	public void setCrime_committed(String crime_committed) {
		this.crime_committed = crime_committed;
	}

	public int getPrison_term() {
		return prison_term;
	}

	public void setPrison_term(int prison_term) {
		this.prison_term = prison_term;
	}

	@Override
	public String toString() {
		return "Criminal [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
				+ ", crime_committed=" + crime_committed + ", prison_term=" + prison_term + "]";
	}
}
