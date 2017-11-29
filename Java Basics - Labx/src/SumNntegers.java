import java.util.Scanner;

public class SumNntegers {
    public static void main(String[] args) { //psvm + tab
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        while (n > 0) {
            int currentNum = scan.nextInt();
            result += currentNum;
            n--;
        }
        System.out.println(result);
    }

}
