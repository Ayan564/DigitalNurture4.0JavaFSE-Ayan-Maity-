package forecast;

public class FinancialForecastIterative {
    public static double forecast(double presentValue, double rate, int periods) {
        double result = presentValue;
        for (int i = 0; i < periods; i++) {
            result *= (1 + rate);
        }
        return result;
    }
}
