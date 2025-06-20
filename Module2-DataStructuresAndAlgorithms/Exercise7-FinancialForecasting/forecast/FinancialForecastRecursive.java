package forecast;

public class FinancialForecastRecursive {
    public static double forecast(double presentValue, double rate, int periods) {
        if (periods == 0) return presentValue;
        return forecast(presentValue, rate, periods - 1) * (1 + rate);
    }
}
