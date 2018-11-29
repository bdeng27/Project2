package com.project2.Dao;

import java.util.List;

import com.project2.model.Expense;

public interface ExpenseDao {
	public List<Expense> getExpensesByUserId(int userId);
	public Expense getExpenseById(int expenseid);
	public int createExpense(Expense expense);
	public int removeExpense(Expense expense);
}
