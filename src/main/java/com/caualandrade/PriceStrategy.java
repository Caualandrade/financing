package com.caualandrade;

public class PriceStrategy implements FinancingStrategy{

    @Override
    public void calculate(double amount, double annualInterestRate, int months) {
        double monthlyRate = Math.pow(1 + annualInterestRate / 100, 1.0 / 12) - 1;
        double installment = amount * (monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        double balance = amount;
        System.out.println("\n--- Price ---");
        for (int i = 1; i <= months; i++) {
            double interest = balance * monthlyRate;
            double amortization = installment - interest;
            balance -= amortization;

            System.out.printf("Parcela %d: Valor= %.2f | Amortização= %.2f | Juros= %.2f | Saldo= %.2f%n",
                    i, installment, amortization, interest, Math.max(balance, 0));
        }
    }
}
