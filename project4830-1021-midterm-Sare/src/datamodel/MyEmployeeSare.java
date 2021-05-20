package datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @since J2SE-1.8
 CREATE TABLE employee (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  age INT NOT NULL,    
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "MyTable1021Sare")
public class MyEmployeeSare {

	   @Override
	public String toString() {
		String result = String.format("%s %s %s %s %s", id, fname, lname, phone, email);
		return result;
	}

	@Id  // primary key
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id") // specify the column name. Without it, it will use method name
	   private Integer id;
	
	   @Column(name = "FIRST_NAME")
	   private String fname;
	   
	   public MyEmployeeSare(Integer id, String fname, String lname, String phone, String email) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}

	public MyEmployeeSare(String fname, String lname, String phone, String email) {
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}
	
	public MyEmployeeSare()
	{
		
	}

	@Column(name = "LAST_NAME")
	   private String lname;
	
	   @Column(name = "PHONE")
	   private String phone;
	   
	   @Column(name = "EMAIL")
	   private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
