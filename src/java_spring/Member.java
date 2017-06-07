package java_spring;

import java.util.Date;

public class Member {

	
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date RegisterDate;
	
	public Member(String email, String password, String name, Date RegesterDate){
		this.email = email;
		this.password = password;
		this.name = name;
		this.RegisterDate = RegesterDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return RegisterDate;
	}
	
	public void changePassword(String oldPassword, String newPassword){
		if(!password.equals(oldPassword)) 
			throw new IdPasswordNotMatchingException();
		this.password=newPassword;
	}
	
	public String memberView(){
		String str =id+" : "+email+" : "+password+" : "+name+" : "+RegisterDate;
		return str;
	}

	
	
	
}

