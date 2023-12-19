public class cos {

    public static void main(String[] args) {
        double x = 0.5; // Cos(x)
        double cosX = calculateCos((x));
        System.out.printf("cos(" + x + ") ≈ %.10f" ,cosX);
    }

    public static double calculateCos(double x) {
        double cos = 1.0; 
        int n = 50; // more num more accurate

        for (int i = 2; i < n; i += 2) {
            // the rule
            double term = Math.pow(-1, i / 2) * Math.pow(x, i) / factorial(i);
            cos += term;
        }

        return cos;
    }
    // Calculate factorial of a number (unchanged)
    public static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
