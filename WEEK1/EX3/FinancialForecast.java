public class FinancialForecast {

    // Recursive function
    static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0)
            return currentValue;

        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10; //10%
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.printf("Present Value : %.2f\n", presentValue);
        System.out.printf("Growth Rate   : %.0f%%\n", growthRate * 100);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f\n", result);
    }
}