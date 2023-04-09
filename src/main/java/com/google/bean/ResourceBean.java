package com.google.bean;

public class ResourceBean {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer contactNumber;
	private String gender;
	private String qualification;
	private String experience;
	private String resumeURI;
	private Integer roleId;
	
	
	public ResourceBean(Integer id, String firstName, String lastName, String email, Integer contactNumber,
			String gender, String qualification, String experience, String resumeURI, Integer roleId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.qualification = qualification;
		this.experience = experience;
		this.resumeURI = resumeURI;
		this.roleId = roleId;
	}


	public ResourceBean() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getResumeURI() {
		return resumeURI;
	}


	public void setResumeURI(String resumeURI) {
		this.resumeURI = resumeURI;
	}


	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	
	
	
}
