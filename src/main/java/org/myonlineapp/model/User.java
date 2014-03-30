package org.myonlineapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends BaseEntity{
	
	private String username;
	private String fullname;
	private String useremail;
	private String userrole;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	

	
}
