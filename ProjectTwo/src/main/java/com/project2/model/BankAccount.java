package com.project2.model;

public class BankAccount {
	private int accountId;
	private long amount;
	private String type;
	private long accountNumber;
	private User user;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accountId, long amount, String type, long accountNumber, User user) {
		super();
		this.accountId = accountId;
		this.amount = amount;
		this.type = type;
		this.accountNumber = accountNumber;
		this.user = user;
	}

	public BankAccount(long amount, String type, long accountNumber, User user) {
		super();
		this.amount = amount;
		this.type = type;
		this.accountNumber = accountNumber;
		this.user = user;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		result = prime * result + (int) (amount ^ (amount >>> 32));
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
		BankAccount other = (BankAccount) obj;
		if (accountId != other.accountId)
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (amount != other.amount)
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

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", amount=" + amount + ", type=" + type + ", accountNumber="
				+ accountNumber + ", user=" + user.getUserId() + "]";
	}
}
