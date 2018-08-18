package com.capg.bean;

public class Merchant {
	private String id;
	private String userName;
	private String phonenumber;
	private String address;
	private String gender;
	private String producttype;
	private String password;
	private String repeatpassword;
public Merchant(String id, String userName, String phonenumber, String address, String gender, String producttype,
			String password, String repeatpassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.phonenumber = phonenumber;
		this.address = address;
		this.gender = gender;
		this.producttype = producttype;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}
@Override
	public String toString() {
		return "Merchant [id=" + id + ", userName=" + userName + ", phonenumber=" + phonenumber + ", address=" + address
				+ ", gender=" + gender + ", producttype=" + producttype + ", password=" + password + ", repeatpassword="
				+ repeatpassword + "]";
	}
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	public Merchant() {
		
	}

}
