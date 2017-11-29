import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class IntegersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= 0 && num2 >= 0 && num3 >= 0) {
            int biggestNum = java.lang.Math.max(num1, java.lang.Math.max(num2, num3));
            if (num1 + num2 == biggestNum) {
                int firstNum = java.lang.Math.min(num1, num2);
                int secondNum = java.lang.Math.max(num1, num2);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, biggestNum);
                System.out.println(msg);
            } else if (num1 + num3 == biggestNum) {
                int firstNum = java.lang.Math.min(num1, num3);
                int secondNum = java.lang.Math.max(num1, num3);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, biggestNum);
                System.out.println(msg);
            } else if (num2 + num3 == biggestNum) {
                int firstNum = java.lang.Math.min(num2, num3);
                int secondNum = java.lang.Math.max(num2, num3);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, biggestNum);
                System.out.println(msg);
            } else {
                System.out.println("No");
            }

        } else {
            int smallestNum = java.lang.Math.min(num1, java.lang.Math.min(num2, num3));
            if (num1 + num2 == smallestNum) {
                int firstNum = java.lang.Math.min(num1, num2);
                int secondNum = java.lang.Math.max(num1, num2);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, smallestNum);
                System.out.println(msg);
            } else if (num1 + num3 == smallestNum) {
                int firstNum = java.lang.Math.min(num1, num3);
                int secondNum = java.lang.Math.max(num1, num3);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, smallestNum);
                System.out.println(msg);
            } else if (num2 + num3 == num1) {
                int firstNum = java.lang.Math.min(num2, num3);
                int secondNum = java.lang.Math.max(num2, num3);
                String msg = MessageFormat.format("{0} + {1} = {2}", firstNum, secondNum, num1);
                System.out.println(msg);
            } else {
                System.out.println("No");
            }
        }
    }
}