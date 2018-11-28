package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Expense;

@Repository
public class ExpenseDaoImpl implements ExpenseDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Expense> getExpensesByUserId(int userId) {
		Session s = sf.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Expense> expenses = s.createQuery("from Expense where user_id= :idVar").setParameter("idVar", userId).list();
		return expenses;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Expense getExpenseById(int expenseid) {
		Session s = sf.openSession();
		//Expense expense = (Expense) s.createQuery("from Expense where expense_id= :idVar").setParameter("idVar", expenseid);
		Expense expense = (Expense) s.load(Expense.class, expenseid);
		return expense;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Expense createExpense(Expense expense) {
		Session s = sf.getCurrentSession();
		s.save(expense);
		return expense;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Expense removeExpense(Expense expense) {
		Session s = sf.getCurrentSession();
		s.delete(expense);
		return expense;
	}

}
