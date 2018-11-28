package com.revature.daos;

import java.util.List;

import com.revature.models.BankAccount;

public interface BankAccountDao {
	public List<BankAccount> getAccountsByUserId(int userId);
	public BankAccount getAccountById(int accountId);
	public BankAccount createAccount(BankAccount account);
	public BankAccount removeAccount(BankAccount account);
}
