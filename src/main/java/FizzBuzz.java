public class FizzBuzz {
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args) {
        int x = 0;
        while (x-- < 100) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (x % 3 == 0) {
                System.out.println("fizz");
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(x);
            }


        }
    }
}
