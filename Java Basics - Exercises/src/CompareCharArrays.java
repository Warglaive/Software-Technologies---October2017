import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().replaceAll("\\s+", "");
        String input2 = scanner.nextLine().replaceAll("\\s+", "");
        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();
        char[] shorterArray;
        char[] tallerArray;
        int smallerArrayCount = Math.min(arr1.length, arr2.length);
        if (arr1.length < arr2.length) { // possible bug
            shorterArray = arr1.clone();
            tallerArray = arr2.clone();
        } else {
            tallerArray = arr1.clone();
            shorterArray = arr2.clone();
        }
        for (int i = 0; i < smallerArrayCount; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            } else if (arr1[i] < arr2[i]) {
                System.out.println(arr1);
                System.out.println(arr2);
                return;
            } else {
                System.out.println(arr2);
                System.out.println(arr1);
                return;
            }
        }
        if (arr1.length == arr2.length) {
            System.out.println(shorterArray);
            System.out.println(tallerArray);
            return;
        } else {
            System.out.println(shorterArray);
            System.out.println(tallerArray);
            return;
        }
    }
}
