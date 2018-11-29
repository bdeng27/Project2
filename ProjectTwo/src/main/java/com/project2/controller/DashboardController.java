package com.project2.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project2.Dao.BankAccountDao;
import com.project2.Dao.BankAccountDaoImpl;
import com.project2.Dao.ExpenseDao;
import com.project2.Dao.ExpenseDaoImpl;
import com.project2.Dao.UserDao;
import com.project2.Dao.UserDaoImpl;
import com.project2.model.BankAccount;
import com.project2.model.Expense;
import com.project2.model.User;

@CrossOrigin
@Controller
public class DashboardController {
	
	UserDao ud = UserDaoImpl.getUserDao();
	BankAccountDao bd = BankAccountDaoImpl.getBankAccountDao();
	ExpenseDao ed = ExpenseDaoImpl.getExpenseDao();
	
	@GetMapping(value="/UserInfo")
	@ResponseBody
	public User getUser() {
		//User u1 = new User(100, "Ben Deng", "bdeng27@vt.edu", "bdeng27", "password", 0, 60000);
		//User u1 = new User(1, "John Doe", "Jdoe@gmail.com", "JDoe", "password", 0, 1000000);
		User u1 = ud.getUserById(1);
		return u1;
	}
	
	@GetMapping(value="/BankInfo")
	@ResponseBody
	public List<BankAccount> getBankAccounts() {
//		User u1 = new User(1, "John Doe", "Jdoe@gmail.com", "JDoe", "password", 0, 1000000);
//		BankAccount b1 = new BankAccount(10000, "checking", 123456789, u1);
//		BankAccount b2 = new BankAccount(1000, "saving", 1234, u1);
//		BankAccount[] bankList = new BankAccount[2];
//		bankList[0] = b1;
//		bankList[1] = b2;
		
		List<BankAccount> bankList = bd.getAccountsByUserId(1);
		System.out.println(bankList);
		return bankList;
	}
	
	@GetMapping(value="/Expenses")
	@ResponseBody
	public Expense[] getExpenses() {
		User u1 = new User(1, "John Doe", "Jdoe@gmail.com", "JDoe", "password", 0, 1000000);
		Expense e1 = new Expense("Rent", 100, Date.valueOf("2018-08-10"), "", u1);
		Expense e2 = new Expense("Power Bill", 100, Date.valueOf("2018-08-10"), "", u1);
		Expense[] expenseList = new Expense[2];
		expenseList[0] = e1;
		expenseList[1] = e2;
		
		return expenseList;
	}
	
	@GetMapping(value="/test")
	@ResponseBody
	public String getTestValue() {
		return "50000";
	}


}