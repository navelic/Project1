package Proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="empID")
	private String empid;
	
	@Column(name="dateOfJoining")
	private String date;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="designation")
	private String designation;
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmpid() {
		return empid;
	}

	public String getDate() {
		return date;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", empid=" + empid + ", date=" + date + ", designation="
				+ designation + "]";
	}
	
	
	
}
