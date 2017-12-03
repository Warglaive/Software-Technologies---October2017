import java.util.Scanner;

public class VowelorDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("a")) {
            System.out.println("vowel");
        } else if (input.equals("e")) {
            System.out.println("vowel");
        } else if (input.equals("i")) {
            System.out.println("vowel");
        } else if (input.equals("o")) {
            System.out.println("vowel");
        } else if (input.equals("u")) {
            System.out.println("vowel");
        } else if (input.equals("y")) {
            System.out.println("vowel");
        } else if (tryParseInt(input)) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }


    static boolean tryParseInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
