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
@Table(name = "employee")
public class Contact {

	   @Id  // primary key
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id") // specify the column name. Without it, it will use method name
	   private Integer id;
	
	   @Column(name = "fname")
	   private String fname;
	   
	   @Column(name = "lname")
	   private String lname;
	
	   @Column(name = "phone")
	   private String phone;
	   
	   @Column(name = "email")
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
	
	public Contact()
	{
		
	}
	
	public Contact(Integer id, String fname, String lname, String phone, String email) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}
	
	public Contact(String fname, String lname, String phone, String email) {
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email
				+ "]";
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
