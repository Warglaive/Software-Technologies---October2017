import java.util.*;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listInt = new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            listInt.add(scan.nextInt());
        }
        Collections.sort(listInt);
        Collections.reverse(listInt);

        if (listInt.size() > 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(listInt.get(i));
            }
        } else {
            for (int i = 0; i < listInt.size(); i++) {
                System.out.println(listInt.get(i));
            }
        }
    }
}