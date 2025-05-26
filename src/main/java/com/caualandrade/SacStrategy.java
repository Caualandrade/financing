package com.caualandrade;

public class SacStrategy implements FinancingStrategy{
    @Override
    public void calculate(double amount, double annualInterestRate, int months) {
        double monthlyRate = Math.pow(1 + annualInterestRate / 100, 1.0 / 12) - 1;
        double amortization = amount / months;
        double balance = amount;

        System.out.println("\n--- SAC ---");
        for (int i = 1; i <= months; i++) {
            double interest = balance * monthlyRate;
            double installment = amortization + interest;
            balance -= amortization;

            System.out.printf("Parcela %d: Valor= %.2f | Amortização= %.2f | Juros= %.2f | Saldo= %.2f%n",
                    i, installment, amortization, interest, Math.max(balance, 0));
        }
    }
}
