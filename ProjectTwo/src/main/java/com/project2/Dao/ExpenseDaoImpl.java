package com.project2.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project2.model.Expense;
import com.project2.util.HibernateUtil;

public class ExpenseDaoImpl implements ExpenseDao {

	private static ExpenseDaoImpl expenseDao;
	
	private ExpenseDaoImpl() {
		
	}
	
	public static ExpenseDaoImpl getExpenseDao() {
		if(expenseDao == null) {
			expenseDao = new ExpenseDaoImpl();
		}
		return expenseDao;
	}
	
	@Override
	public List<Expense> getExpensesByUserId(int userId) {
		Session s = HibernateUtil.getSession();
		List<Expense> expenses = new ArrayList<Expense>();
		String hql = "from Expense where user_id = :idVar";
		Query<Expense> q = s.createQuery(hql, Expense.class);
		q.setParameter("idVar", userId);
		expenses = q.getResultList();
		return expenses;
	}

	@Override
	public Expense getExpenseById(int expenseid) {
		Session s = HibernateUtil.getSession();
		String hql= "from Expense where expense_id= :idVar";
		Query<Expense> q = s.createQuery(hql, Expense.class);
		q.setParameter("idVar", expenseid);
		Expense expense = q.getSingleResult();
		return expense;
	}

	@Override
	public int createExpense(Expense expense) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int expensePK = (int) s.save(expense);
		tx.commit();
		s.close();
		return expensePK;
	}

	@Override
	public int removeExpense(Expense expense) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int expensePK = expense.getExpenseId();
		s.remove(expense);
		tx.commit();
		s.close();
		return expensePK;
	}
	
}