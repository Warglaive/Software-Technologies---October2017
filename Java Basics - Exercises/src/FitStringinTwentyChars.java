import java.util.Scanner;

public class FitStringinTwentyChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();

        if (arr.length < 20) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                counter++;
                System.out.print(arr[i]);
            }
            while (counter < 20) {
                System.out.print('*');
                counter++;
            }
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.print(arr[i]);
            }
        }
    }
}
