package com.revature.main;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.BankAccount;
import com.revature.models.Expense;
import com.revature.models.User;
import com.revature.daos.BankAccountDao;
import com.revature.daos.ExpenseDao;
import com.revature.daos.UserDao;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		BankAccountDao bd = (BankAccountDao) ac.getBean("bankAccountDaoImpl");
		ExpenseDao ed = (ExpenseDao) ac.getBean("expenseDaoImpl");
		
//		User u1 = new User("John Doe", "Jdoe@gmail.com", "JDoe", "password", 0, 1000000);
//		User u2 = new User("Brianna Roberts", "BRoberts@gmail.com", "BRoberts", "password", 0, 2000000);
//		User u3 = new User("Jane Smith", "JSmith@gmail.com", "JSmith", "password", 0, 2000000);
//		
//		ud.createUser(u1);
//		ud.createUser(u2);
//		ud.createUser(u3);
//		
//		Expense e1 = new Expense("Rent", 100, Date.valueOf("2018-08-10"), "", u1);
//		Expense e2 = new Expense("Power Bill", 100, Date.valueOf("2018-08-10"), "", u1);
//		Expense e3 = new Expense("Rent", 100, Date.valueOf("2018-08-10"), "", u2);
//		
//		ed.createExpense(e1);
//		ed.createExpense(e2);
//		ed.createExpense(e3);
//		
//		BankAccount b1 = new BankAccount(10000, "checking", 123456789, u1);
//		BankAccount b2 = new BankAccount(1000, "saving", 1234, u1);
//		BankAccount b3 = new BankAccount(100, "checking", 1234567, u3);
//		
//		bd.createAccount(b1);
//		bd.createAccount(b2);
//		bd.createAccount(b3);
//		
//		System.out.println("all users:" + ud.getUsers());
//		System.out.println("expenses user1:" + ed.getExpensesByUserId(u1.getUserId()));
//		System.out.println("accounts user 1:" + bd.getAccountsByUserId(u1.getUserId()));
//		
//		System.out.println("user 1 by id" + ud.getUserById(u1.getUserId()));
//		System.out.println("user 1 by email" + ud.getUserByEmail(u1.getEmail()));
//		System.out.println("expense 1 by expense id" + ed.getExpenseById(1));
//		System.out.println("account by account id" + bd.getAccountById(1));
//		
//		ed.removeExpense(e1);
//		bd.removeAccount(b1);
//		
//		u1.setName("Cam Newton");
//		System.out.println(ud.getUsers());
//		
//		ud.updateUser(u1);
//		System.out.println(ud.getUsers());
	}
}
