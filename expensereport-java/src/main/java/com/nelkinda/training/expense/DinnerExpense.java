package com.nelkinda.training.expense;

public class DinnerExpense implements MealExpense {

	@Override
	public int calculateExpense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String expenseName() {
		// TODO Auto-generated method stub
		return "Dinner";
	}

	@Override
	public int calculateMealExpense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMealOverExpense() {
		if (calculateExpense() > 5000) {
			return "X";
		}
		return "";
	}

}
