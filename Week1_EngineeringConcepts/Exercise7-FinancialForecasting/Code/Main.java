package Code;
import Code.forecast.FinancialForecastIterative;
import Code.forecast.FinancialForecastRecursive;

public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double rate = 0.05; // 5% annual growth
        int periods = 5;

        double recursiveResult = FinancialForecastRecursive.forecast(presentValue, rate, periods);
        double iterativeResult = FinancialForecastIterative.forecast(presentValue, rate, periods);

        System.out.printf("Recursive Forecast for %d years: %.2f\n", periods, recursiveResult);
        System.out.printf("Iterative Forecast for %d years: %.2f\n", periods, iterativeResult);
    }
}
