import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Enter text");
        System.out.println("2. Provide a file");

        int choice = scanner.nextInt();

        if (choice == 1) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter text: ");
            String inputText = scanner.nextLine();
            int wordCount = countWords(inputText);
            System.out.println("Word count: " + wordCount);
        } else if (choice == 2) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();
            try {
                File file = new File(filePath);
                Scanner fileScanner = new Scanner(file);
                StringBuilder fileContent = new StringBuilder();
                while (fileScanner.hasNextLine()) {
                    fileContent.append(fileScanner.nextLine());
                    fileContent.append(" "); // Add a space to separate lines
                }
                int wordCount = countWords(fileContent.toString());
                System.out.println("Word count: " + wordCount);
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+"); // Split by whitespace (space, tab, newline, etc.)
        return words.length;
    }
}
