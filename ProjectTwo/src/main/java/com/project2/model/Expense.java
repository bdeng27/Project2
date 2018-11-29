package com.project2.model;

import java.sql.Date;

public class Expense {
	private int expenseId;
	private String type;
	private long amount;
	private Date date;
	private String location;
	private User user;
	
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(int expenseId, String type, long amount, Date date, String location, User user) {
		super();
		this.expenseId = expenseId;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.location = location;
		this.user = user;
	}

	public Expense(String type, long amount, Date date, String location, User user) {
		super();
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.location = location;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", type=" + type + ", amount=" + amount + ", date=" + date
				+ ", location=" + location + ", user=" + user.getUserId() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (amount ^ (amount >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + expenseId;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Expense other = (Expense) obj;
		if (amount != other.amount)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (expenseId != other.expenseId)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
