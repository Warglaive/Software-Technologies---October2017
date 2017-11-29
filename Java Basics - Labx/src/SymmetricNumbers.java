import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isReversed(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isReversed(int num) {
        boolean reversed = false;
        String str = String.valueOf(num);
        String reverse = new StringBuilder(str).reverse().toString();
        if (reverse.equals(str)) {
            reversed = true;
        }
        return reversed;
    }
}