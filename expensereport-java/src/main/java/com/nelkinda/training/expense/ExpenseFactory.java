package com.nelkinda.training.expense;

public class ExpenseFactory  {

	public static ExpenseInterface createExpense(ExpenseType expenseType) {
		
	
		if (expenseType == ExpenseType.DINNER) {
			return new DinnerExpense();
		} else if (expenseType == ExpenseType.CAR_RENTAL) {
			return new CarrentalExpense();
		}
		else if (expenseType == ExpenseType.BREAKFAST) {
			return new BreakfastExpense();
		}

		return null;
	}

}
