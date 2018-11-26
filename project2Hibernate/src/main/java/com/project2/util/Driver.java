package com.project2.util;

import java.sql.Date;

import org.hibernate.Session;

import com.project2.Dao.BankAccountDao;
import com.project2.Dao.BankAccountDaoImpl;
import com.project2.Dao.ExpenseDao;
import com.project2.Dao.ExpenseDaoImpl;
import com.project2.Dao.UserDao;
import com.project2.Dao.UserDaoImpl;
import com.project2.model.BankAccount;
import com.project2.model.Expense;
import com.project2.model.User;
import com.project2.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession();
		s.close();
		
		UserDao ud = new UserDaoImpl();
		ExpenseDao ed = new ExpenseDaoImpl();
		BankAccountDao bd = new BankAccountDaoImpl();
		
		User u1 = new User("John Doe", "Jdoe@gmail.com", "password", 0, 1000000);
		User u2 = new User("Brianna Roberts", "BRoberts@gmail.com", "password", 0, 2000000);
		User u3 = new User("Jane Smith", "JSmith@gmail.com", "password", 0, 2000000);
		
		ud.createUser(u1);
		ud.createUser(u2);
		ud.createUser(u3);
		
		Expense e1 = new Expense("Rent", 100, Date.valueOf("2018-08-10"), "", u1);
		Expense e2 = new Expense("Power Bill", 100, Date.valueOf("2018-08-10"), "", u1);
		Expense e3 = new Expense("Rent", 100, Date.valueOf("2018-08-10"), "", u2);
		
		ed.createExpense(e1);
		ed.createExpense(e2);
		ed.createExpense(e3);
		
		BankAccount b1 = new BankAccount(10000, "checking", 123456789, u1);
		BankAccount b2 = new BankAccount(1000, "saving", 1234, u1);
		BankAccount b3 = new BankAccount(100, "checking", 1234567, u3);
		
		bd.createAccount(b1);
		bd.createAccount(b2);
		bd.createAccount(b3);
		
		System.out.println("all users:" + ud.getUsers());
		System.out.println("expenses user1:" + ed.getExpensesByUserId(u1.getUserId()));
		System.out.println("accounts user 1:" + bd.getAccountsByUserId(u1.getUserId()));
		
		System.out.println("user 1 by id" + ud.getUserById(u1.getUserId()));
		System.out.println("user 1 by email" + ud.getUserByEmail(u1.getEmail()));
		
		ed.removeExpense(e1);
		bd.removeAccount(b1);
		
		u1.setName("Cam Newton");
		ud.updateUser(u1);
		
	}
}