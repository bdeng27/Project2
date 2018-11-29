package com.project2.Dao;

import java.util.List;

import com.project2.model.BankAccount;

public interface BankAccountDao {
	public List<BankAccount> getAccountsByUserId(int userId);
	public BankAccount getAccountById(int accountId);
	public int createAccount(BankAccount account);
	public int removeAccount(BankAccount account);
}
