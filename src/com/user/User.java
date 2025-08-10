package com.user;

import java.io.Serializable;


public class User implements Serializable
{
	private int userId;
	private String userName;
	private int userAge;
	private String userGender;
	private long userMobileNo;
	
	public User() {}

	public User(int userId, String userName, int userAge, String userGender, long userMobileNo) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userMobileNo = userMobileNo;
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userGender="
				+ userGender + ", userMobileNo=" + userMobileNo + "]";
	}

	public void displayUserInfo()
	{
		System.out.println("\n============= USER-INFORMATION =============");
		System.out.println("User Id       : "+getUserId());
		System.out.println("User Name     : "+getUserName());
		System.out.println("Gender        : "+getUserGender());
		System.out.println("Mobile Number : "+getUserMobileNo());
		System.out.println("----------------------------------------------");
	}
	
}
