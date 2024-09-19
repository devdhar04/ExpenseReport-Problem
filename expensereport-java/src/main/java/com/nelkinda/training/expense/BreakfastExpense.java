package com.nelkinda.training.expense;

public class BreakfastExpense implements MealExpense {

	@Override
	public int calculateExpense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String expenseName() {
		// TODO Auto-generated method stub
		return "Breakfast";
	}

	@Override
	public int calculateMealExpense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMealOverExpense() {
		if (calculateExpense() > 1000) {
			return "X";
		}
		return "";
	}

}
