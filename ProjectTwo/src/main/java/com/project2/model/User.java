package com.project2.model;

import java.util.List;

public class User {
	private int userId;
	private String name;
	private String email;
	private String username;
	private String password;
	//1=manager 2=standard user
	private int isManager;
	private long income;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String email, String username, String password, int isManager, long income) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.isManager = isManager;
		this.income = income;
		this.username = username;
	}

	public User(String name, String email, String username, String password, int isManager, long income) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.isManager = isManager;
		this.income = income;
		this.username = username;
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (income ^ (income >>> 32));
		result = prime * result + isManager;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (income != other.income)
			return false;
		if (isManager != other.isManager)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", isManager=" + isManager + ", income=" + income + "]";
	}

	public User validate(List<User> userList) {
		User u = null;
		//System.out.println(this.getUsername());
		//System.out.println(this.getPassword());
		for (User temp : userList) {
			//System.out.println(username.equals(temp.getUsername()));
			//System.out.println(temp.getPassword());
			if (this.getUsername().equals(temp.getUsername()) && this.getPassword().equals(temp.getPassword())) {
				u = temp;
				break;
			}
		}
		return u;
	}
}
