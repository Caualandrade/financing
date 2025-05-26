package com.caualandrade;

public interface FinancingStrategy {
    void calculate(double amount, double annualInterestRate, int months);
}
