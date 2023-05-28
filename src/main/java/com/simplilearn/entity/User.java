package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long userid;
private String username;
private String useremail;
private String useraddress;
private String userphone;
private String userpassword;
public long getUserid() {
	return userid;
}
public void setUserid(long userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getUseraddress() {
	return useraddress;
}
public void setUseraddress(String useraddress) {
	this.useraddress = useraddress;
}
public String getUserphone() {
	return userphone;
}
public void setUserphone(String userphone) {
	this.userphone = userphone;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public User(String username, String useremail, String useraddress, String userphone, String userpassword) {
	super();
	this.username = username;
	this.useremail = useremail;
	this.useraddress = useraddress;
	this.userphone = userphone;
	this.userpassword = userpassword;
}
public User() {

}

}
