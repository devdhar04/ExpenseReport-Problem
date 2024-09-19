package com.nelkinda.training;

import java.util.List;

import com.nelkinda.training.expense.ExpenseInterface;
import com.nelkinda.training.expense.ExpenseReporterService;
import com.nelkinda.training.expense.ExpenseType;
import com.nelkinda.training.expense.MealExpense;

class Expense {
	ExpenseType type;
	int amount;
}


public class ExpenseReport {
	public void printReport(List<ExpenseInterface> expenses) {
		 
		for (ExpenseInterface expense : expenses) {

			
			String mealOverExpensesMarker =  "";
			if (expense instanceof MealExpense) {
				MealExpense mealExpense = (MealExpense) expense;
				mealOverExpensesMarker = mealExpense.getMealOverExpense();
				
			}

			System.out.println(
					expense.expenseName() + "\t" + expense.calculateExpense() + "\t" + mealOverExpensesMarker);

			
		}
		ExpenseReporterService expenseService = new ExpenseReporterService();
		System.out.println("Meal expenses: " + expenseService.calculateMealExpense(expenses));
		System.out.println("Total expenses: " + expenseService.calculateTotalExpense(expenses));
	}

	 
}
