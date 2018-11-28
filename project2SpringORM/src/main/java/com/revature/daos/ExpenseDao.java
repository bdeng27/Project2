package com.revature.daos;

import java.util.List;

import com.revature.models.Expense;

public interface ExpenseDao {
	public List<Expense> getExpensesByUserId(int userId);
	public Expense getExpenseById(int expenseid);
	public Expense createExpense(Expense expense);
	public Expense removeExpense(Expense expense);
}
