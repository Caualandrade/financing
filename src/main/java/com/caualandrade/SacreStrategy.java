package com.caualandrade;

public class SacreStrategy implements FinancingStrategy{

    @Override
    public void calculate(double amount, double annualInterestRate, int months) {
        double monthlyRate = Math.pow(1 + annualInterestRate / 100, 1.0 / 12) - 1;
        double amortization = amount / months;
        double balance = amount;
        double growth = 0.003;

        double installment = (amortization + (amount * monthlyRate)) * 0.85;

        System.out.println("\n--- SACRE ---");
        for (int i = 1; i <= months; i++) {
            double adjustedInstallment = installment * Math.pow(1 + growth, i - 1);
            double interest = balance * monthlyRate;
            double amortizationCurrent = adjustedInstallment - interest;
            balance -= amortizationCurrent;

            System.out.printf("Parcela %d: Valor= %.2f | Amortização= %.2f | Juros= %.2f | Saldo= %.2f%n",
                    i, adjustedInstallment, amortizationCurrent, interest, Math.max(balance, 0));
        }
    }
}
