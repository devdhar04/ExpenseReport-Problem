package com.nelkinda.training.expense;

import java.util.List;

interface ExpenseReportInterface {
	int calculateMealExpense(List<ExpenseInterface> expense);

	int calculateTotalExpense(List<ExpenseInterface> expense);

}

