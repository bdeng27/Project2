package com.project2.services;

import java.util.List;

import com.project2.Dao.ExpenseDaoImpl;
import com.project2.model.Expense;

public class ExpenseService {
	public List<Expense> getAllExpenseByUserId(int userId){
		return ExpenseDaoImpl.getExpenseDao().getExpensesByUserId(userId);
	}
	
	public Expense getExpenseByExpenseId(int expenseId) {
		return ExpenseDaoImpl.getExpenseDao().getExpenseById(expenseId);
	}
	
	public int createNewExpense(Expense expense) {
		return ExpenseDaoImpl.getExpenseDao().createExpense(expense);
	}
	
	public int removeExpense(Expense expense) {
		return ExpenseDaoImpl.getExpenseDao().removeExpense(expense);
	}
}