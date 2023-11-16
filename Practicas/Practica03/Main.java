public class Main {
    public static void main(String[] args) {
        // Conversor de temperatura
        double celsius = 20;
        double fahrenheit = fahrenheitcambio(celsius);
        System.out.println(" "+ fahrenheit);

        // F
        int num = 10;
        boolean isComposite = f(num);
        System.out.println("Number: " + num + " Is Composite: " + isComposite);

        // F
        int n = 5;
        int factorial = f(n);
        System.out.println("Number: " + n + " Factorial: " + factorial);

        
                int num = 10;
                boolean isComposite = f(num);
                System.out.println("Number: " + num + " Is Composite: " + isComposite);
        
                // Testing f method
                int n = 5;
                int factorial = f(n);
                System.out.println("Number: " + n + " Factorial: " + factorial);
            }
        
            public static boolean f(int num) {
                if (num <= 1) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return true;
                }
                return false;
            }
        
            public static int f(int n) {
                if (n == 0) return 1;
                return n * f(n - 1);
            }
        }
    }

}