package model;

public class Voter {

	private int voterId;
	private String name;
	
	Address ad; //voter has address.
	public Address getAddress() {
		return ad;
	}
	private String email;
	private String contact;
	private int age;
	private String gender;
	
	 
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(Address ad) 
	{
		
		this.ad=ad;
		
	}
	

}
