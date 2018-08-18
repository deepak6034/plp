package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
private int C_id;
private String C_username;
private String C_password;
private String C_status;
public int getC_id() {
	return C_id;
}
public void setC_id(int c_id) {
	C_id = c_id;
}
public String getC_username() {
	return C_username;
}
public void setC_username(String c_username) {
	C_username = c_username;
}
public String getC_password() {
	return C_password;
}
public void setC_password(String c_password) {
	C_password = c_password;
}
public String getC_status() {
	return C_status;
}
public void setC_status(String c_status) {
	C_status = c_status;
}
public Customer(int c_id, String c_username, String c_password, String c_status) {
	super();
	C_id = c_id;
	C_username = c_username;
	C_password = c_password;
	C_status = c_status;
}
@Override
public String toString() {
	return "Customer [C_id=" + C_id + ", C_username=" + C_username + ", C_password=" + C_password + ", C_status="
			+ C_status + "]";
}
Customer() {
	
}
}
