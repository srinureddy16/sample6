public class prime {
    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility by numbers from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop if a divisor is found
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}