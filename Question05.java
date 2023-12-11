public class Question05 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int lowerLimit = 50;
        int upperLimit = 100;

        int count = 0;
        int sum = 0;

        for (int num = lowerLimit; num < upperLimit; num++) {
            if (isPrime(num)) {
                count++;
                sum += num;
            }
        }
        System.out.println("Number of prime numbers between 50 and 100: " + count);
        System.out.println("Sum of prime numbers between 50 and 100: " + sum);
    }
}
