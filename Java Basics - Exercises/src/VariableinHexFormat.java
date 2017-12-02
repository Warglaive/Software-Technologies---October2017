import java.util.Scanner;

public class VariableinHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexa = scanner.nextLine();
        int a =Integer.parseInt(hexa, 16);
        System.out.println(a);
    }
}
