
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanCountry {

    public static void main(String[] args) {
        String[] countries = {"Nigeria", "Zambia", "Morocco"};
        Random rand = new Random();
        String selectedCountry = countries[rand.nextInt(countries.length)].toLowerCase();  // Randomly choose a country and make it lowercase

        StringBuilder maskedString = new StringBuilder();
        for (int i = 0; i < selectedCountry.length(); i++) {
            maskedString.append('-');  // Initialize masked string with dashes
        }

        ArrayList<Character> missedLetters = new ArrayList<>();  // To store incorrect guesses
        Scanner scanner = new Scanner(System.in);

        while (maskedString.toString().contains("-")) {  // Continue until all letters are guessed
            System.out.println("Current word: " + maskedString);
            System.out.println("Missed letters: " + missedLetters);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);  // Get user's guess

            if (selectedCountry.indexOf(guess) != -1) {  // Check if guessed character is in the word
                for (int i = 0; i < selectedCountry.length(); i++) {
                    if (selectedCountry.charAt(i) == guess) {
                        maskedString.setCharAt(i, guess);  // Reveal correct guess in masked string
                    }
                }
                System.out.println("Good guess!");
            } else {
                if (!missedLetters.contains(guess)) {
                    missedLetters.add(guess);  // Add incorrect guess to missed letters
                    System.out.println("Wrong guess!");
                } else {
                    System.out.println("You've already guessed that letter!");
                }
            }
        }

        System.out.println("Congratulations! You've guessed the word: " + selectedCountry);
        scanner.close();
    }
}
