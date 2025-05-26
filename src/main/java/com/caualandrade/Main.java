package com.caualandrade;

public class Main {
    public static void main(String[] args) {
        double amount = 80000;
        double annualInterest = 14;
        int months = 60;

        FinancingCalculator calculator = new FinancingCalculator(new PriceStrategy());
        calculator.executeCalculation(amount, annualInterest, months);

        calculator.setStrategy(new SacStrategy());
        calculator.executeCalculation(amount, annualInterest, months);

        calculator.setStrategy(new SacreStrategy());
        calculator.executeCalculation(amount, annualInterest, months);
    }
}