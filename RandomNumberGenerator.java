import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Define the range (inclusive)
        int min = 1;
        int max = 100;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random Number: " + randomNumber);
    }
}
