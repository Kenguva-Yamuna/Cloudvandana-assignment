import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The given sentence is a pangram.");
        } else {
            System.out.println("The given sentence is not a pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        return charSet.size() == 26; 
    }
}
