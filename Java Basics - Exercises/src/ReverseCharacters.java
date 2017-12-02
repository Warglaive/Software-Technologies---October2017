
import java.util.*;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            String letter = scanner.nextLine();
            result.add(letter);
        }
        Collections.reverse(result);
        for (int i = 0; i < 3; i++) {
            System.out.print(result.get(i));
        }
    }
}