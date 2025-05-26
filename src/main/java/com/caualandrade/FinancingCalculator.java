package com.caualandrade;

public class FinancingCalculator {
    private FinancingStrategy strategy;
    public FinancingCalculator(FinancingStrategy financingStrategy) {
        this.strategy = financingStrategy;
    }

    public void setStrategy(FinancingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeCalculation(double amount, double annualInterestRate, int months) {
        strategy.calculate(amount, annualInterestRate, months);
    }

}
