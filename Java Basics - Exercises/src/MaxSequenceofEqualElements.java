import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        int maxCount = 1;
        int element = numbers[0];
        int currentCount = 1;
        for (int currentPosition = 1; currentPosition < numbers.length; currentPosition++) {
            int leftPosition = currentPosition - 1;
            if (numbers[currentPosition] == numbers[leftPosition]) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    element = numbers[currentPosition];
                }
            } else {
                currentCount = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(element + " ");
        }
    }
}
