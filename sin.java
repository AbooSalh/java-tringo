public class sin {

    public static void main(String[] args) {
        double x = 0.5; // sic(x)
        double sinX = calculateSin(x);
        System.out.printf("sin(" + x + ") ≈ %.10f", sinX);
    }

    public static double calculateSin(double x) {
        double sin = 0.0;
        int n = 10;// more nuber more acurate
        for (int i = 0; i < n; i++) {
            // the rule
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
            sin += term;
        }
        return sin;
    }

    public static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}