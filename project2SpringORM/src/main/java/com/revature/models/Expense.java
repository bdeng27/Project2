package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="EXPENSE")
public class Expense {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="expenseSequence")
	@SequenceGenerator(name="expenseSequence", allocationSize=1, sequenceName="SQ_EXPENSE_PK")
	@Column(name="EXPENSE_ID")
	private int expenseId;
	
	@Column(name="EXPENSE_TYPE")
	private String type;
	
	@Column(name="EXPENSE_AMOUNT")
	private long amount;
	
	@Column(name="EXPENSE_DATE")
	private Date date;
	
	@Column(name="EXPENSE_LOCATION")
	private String location;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
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
				+ ", location=" + location + ", user=" + user + "]";
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

