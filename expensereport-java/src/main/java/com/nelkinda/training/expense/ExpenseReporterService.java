package com.nelkinda.training.expense;

import java.util.List;

public class ExpenseReporterService implements ExpenseReportInterface {

	@Override
	public int calculateMealExpense(List<ExpenseInterface> expense) {
		int mealExpenses = 0;
		for (int i = 0; i < expense.size(); i++) {
			ExpenseInterface expenseObj = expense.get(i);
			if (expenseObj instanceof MealExpense) {
				mealExpenses += expenseObj.calculateExpense();
			}

		}

		return mealExpenses;
	}

	@Override
	public int calculateTotalExpense(List<ExpenseInterface> expense) {
		int total = 0;
		for (int i = 0; i < expense.size(); i++) {
			ExpenseInterface expenseObj = expense.get(i);

			total += expenseObj.calculateExpense();

		}
		return total;
	}

}