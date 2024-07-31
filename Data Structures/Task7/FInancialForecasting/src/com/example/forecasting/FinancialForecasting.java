package com.example.forecasting;

public class FinancialForecasting {
   
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years <= 0) {
            return currentValue; // Base case: no more years to forecast
        } else {
            return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        
        double initialInvestment = 1000.00; 
        double annualGrowthRate = 0.05; 
        int forecastYears = 10; 
        
        double futureValue = forecasting.calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        
        System.out.printf("The value after %d years is: $%.2f%n", forecastYears, futureValue);
    }
}
