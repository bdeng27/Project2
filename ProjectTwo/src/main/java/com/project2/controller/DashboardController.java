package com.project2.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/UserInfo", method = RequestMethod.POST)
	@ResponseBody
	public User getUser(@RequestBody String val) {
		int id = Integer.parseInt(val);
		System.out.println(val);
		User u1 = ud.getUserById(id);
		return u1;
	}
	
	@RequestMapping(value="/BankInfo", method = RequestMethod.POST)
	@ResponseBody
	public List<BankAccount> getBankAccounts(@RequestBody String val) {
		int id = Integer.parseInt(val);
		List<BankAccount> bankList = bd.getAccountsByUserId(id);
		System.out.println(bankList);
		return bankList;
	}
	
	@RequestMapping(value="/Expenses", method = RequestMethod.POST)
	@ResponseBody
	public List<Expense> getExpenses(@RequestBody String val) {
		int id = Integer.parseInt(val);
		List<Expense> expList = ed.getExpensesByUserId(id);
		System.out.println(expList);
		return expList;
	}
	
	@GetMapping(value="/test")
	@ResponseBody
	public String getTestValue() {
		return "50000";
	}


}