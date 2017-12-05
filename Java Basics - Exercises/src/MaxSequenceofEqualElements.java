import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        int sequenceCounter = 1;
        int element = numbers[0];
        int maxCounter = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                sequenceCounter++;
                if (sequenceCounter > maxCounter) {
                    maxCounter = sequenceCounter;
                    element = numbers[i];
                }
            } else {
                sequenceCounter = 1;
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(element + " ");
        }
    }
}
