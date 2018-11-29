package com.project2.services;

import java.util.List;

import com.project2.Dao.BankAccountDaoImpl;
import com.project2.model.BankAccount;

public class BankAccountService {
	public static List<BankAccount> getBankAccountsByUserId(int userId) {
		return BankAccountDaoImpl.getBankAccountDao().getAccountsByUserId(userId);
	}
	
	public static BankAccount getBankAccountByAccountId(int accountId) {
		return BankAccountDaoImpl.getBankAccountDao().getAccountById(accountId);
	}
	
	public static int createNewAccount(BankAccount account) {
		return BankAccountDaoImpl.getBankAccountDao().createAccount(account);
	}
	
	public static int removeAccount(BankAccount account) {
		return BankAccountDaoImpl.getBankAccountDao().removeAccount(account);
	}
}