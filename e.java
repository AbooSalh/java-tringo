public class e {

    public static void main(String[] args) {
        double x = 0.5; // e^x
        double expX = calculateExp(x);
        System.out.printf("e^" + x + " ≈ %.9f", expX);
    }

    public static double calculateExp(double x) {
        double exp = 1.0;
        int n = 300; // more nuber more acurate

        for (int i = 1; i < n; i++) {
            // the rule
            double term = Math.pow(x, i) / factorial(i);
            exp += term;
        }
        return exp;
    }
    public static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
