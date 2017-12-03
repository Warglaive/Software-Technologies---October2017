import java.util.*;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        int mostFrequentNum = numbers[0];
        int occurrences = 0;
        int maxOccurrences = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    occurrences++;
                }
            }
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                mostFrequentNum = numbers[i];
            }
            occurrences = 0;
        }
        System.out.println(mostFrequentNum);
    }
}
