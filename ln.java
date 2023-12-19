public class ln {

    public static void main(String[] args) {
        double x = 0.5; // lnx


        double lnX = calculateLn(x);
        System.out.printf("ln(" + x + ") ≈ %.10f", lnX);
    }

    public static double calculateLn(double x) {
        if (x <= 0) {
            System.out.println("number must be positive");
        }

        double ln = 0.0;
        int n = 50; // more nuber more acurate
        for (int i = 1; i < n; i++) {
            // the rule
            double term = Math.pow(-1, i + 1) * Math.pow(x - 1, i) / i;
            ln += term;
        }

        return ln;
    }
}
